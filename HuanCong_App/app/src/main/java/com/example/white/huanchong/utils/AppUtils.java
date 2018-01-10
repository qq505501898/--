package com.example.white.huanchong.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class AppUtils {
	// 保存用户或寄养师当前是否切换状态
	public static boolean isUserState;
	// 全局上下文
	public static Context appContext;

	// http://192.168.25.167

	// http://www.yhq1913.com

	// 内网请求连接http://123.56.150.230:8885/dog_family/    192.168.43.249
	public static final String BASE_URL = "http://123.56.150.230:8885";
	//public static final String BASE_URL = "http://172.16.52.38:8080";
	//public static final String BASE_URL = "http://169.254.200.100:8080";
	//public static final String BASE_URL = "http://192.168.43.249:8080";

	// 数据请求URL
	public static final String REQUESTURL = BASE_URL + "/dog_family/";

	// 请求图片的URL
	public static final String HTTP_IMAGE_URL = BASE_URL + "/dog_family/upload";

	public static String currAccount;

	public static String locationX = "0.0";
	public static String locationY = "0.0";
	public static boolean isPosition;
	public static final String CLOUD_TABLE = "57610f0f7bbf19231f90b8a2";
	public static String TABLE_ID = "57610f0f7bbf19231f90b8a2";

	public static String KEY = "b0b45f3b228b2ef244a10b496eb49680";

	public static String SAVE_URL = "http://yuntuapi.amap.com/datamanage/data/create";

	public static String UPDATE_URL = "http://yuntuapi.amap.com/datamanage/data/update";

	public static String DELETE_URL = "http://yuntuapi.amap.com/datamanage/data/delete";

	public static double parseDouble(double d) {
		DecimalFormat df = new DecimalFormat("0.000000",
				new DecimalFormatSymbols(Locale.US));
		return Double.parseDouble(df.format(d));
	}

	public static void setLocation(String x, String y) {
		AppUtils.locationX = x;
		AppUtils.locationY = y;
	}


	public static Context getAppContext() {
		return appContext;
	}

	public static void setAppContext(Context appContext) {
		AppUtils.appContext = appContext;
	}

	/**
	 * 关闭软键�?
	 * 
	 * @param activity
	 */
	public static void closeFoldUpTheKeyboard(Activity activity) {
		InputMethodManager imm = (InputMethodManager) appContext
				.getSystemService(Context.INPUT_METHOD_SERVICE);
		if (imm != null) {
			imm.hideSoftInputFromWindow(activity.getWindow().getDecorView()
					.getWindowToken(), 0);
		}
	}

	/**
	 * �?测是否有emoji表情
	 * 
	 * @param source
	 * @return
	 */
	public static boolean containsEmoji(String source) {
		int len = source.length();
		for (int i = 0; i < len; i++) {

			char codePoint = source.charAt(i);
			if (!isEmojiCharacter(codePoint)) { // 如果不能匹配,则该字符是Emoji表情
				return true;
			}
		}
		return false;
	}

	/**
	 * 判断是否是Emoji
	 * 
	 * @param codePoint
	 *            比较的单个字�?
	 * @return
	 */
	private static boolean isEmojiCharacter(char codePoint) {
		return (codePoint == 0x0) || (codePoint == 0x9) || (codePoint == 0xA)
				|| (codePoint == 0xD)
				|| ((codePoint >= 0x20) && (codePoint <= 0xD7FF))
				|| ((codePoint >= 0xE000) && (codePoint <= 0xFFFD))
				|| ((codePoint >= 0x10000) && (codePoint <= 0x10FFFF));
	}

	public static void startActivity(Context context,
			Map<String, Object> params, Class class1) {
		Intent intent = new Intent(context, class1);
		Set<String> set = params.keySet();
		for (String string : set) {
			intent.putExtra(string, params.get(string).toString());
		}
		context.startActivity(intent);
	}

	/**
	 * 限制回车换行
	 * 
	 * @param et
	 */
	public static void LimitsEditEnter(EditText et) {
		et.setOnEditorActionListener(new OnEditorActionListener() {
			@Override
			public boolean onEditorAction(TextView v, int actionId,
					KeyEvent event) {
				return (event.getKeyCode() == KeyEvent.KEYCODE_ENTER);
			}
		});
	}

	/**
	 * 判断应用是否赋予某个权限
	 * 
	 * @param permisstion
	 */
	public static Boolean isCheckPermisstion(String permisstion) {
		PackageManager pm = appContext.getPackageManager();
		Boolean isPermisstion = (PackageManager.PERMISSION_GRANTED == pm
				.checkPermission(permisstion, appContext.getPackageName()));
		if (isPermisstion) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @描述 : 设置字体
	 * @方法名称 : setTypeFace---->AppUtils.java
	 * @作�?? : Android - yhq
	 * @创建日期 : 2016�?3�?25�? 上午11:45:55
	 * @param context
	 * @param
	 * @param path
	 */
	public static void setTypeFace(Context context, ViewGroup viewGroup,
			String path) {
		Typeface typeface = Typeface.createFromAsset(context.getAssets(), path);
		for (int i = 0; i < viewGroup.getChildCount(); i++) {
			Object v = viewGroup.getChildAt(i);
			if (v instanceof TextView) {
				((TextView) v).setTypeface(typeface);
			} else if (v instanceof Button) {
				((Button) v).setTypeface(typeface);
			}
		}
	}

	/**
	 * 
	 * @描述: 解决嵌套冲突
	 * @作�??: Android - CXP
	 * @创建日期: 2016�?4�?12�? 下午3:47:06
	 */
	public static void setListViewHeight(ListView fragLv) {
		// 获得ListView的�?�配�?
		ListAdapter adapter = fragLv.getAdapter();
		if (adapter == null)
			return;
		int height = 0;
		for (int i = 0; i < adapter.getCount(); i++) {
			// 拿到Item
			View listViewItem = adapter.getView(i, null, fragLv);
			// 计算宽高
			listViewItem.measure(0, 0);
			// 叠加没一个子项的宽高
			height += listViewItem.getMeasuredHeight();
		}
		// 设置高度
		ViewGroup.LayoutParams params = fragLv.getLayoutParams();
		// Item的高度乘以分割线的高�?
		params.height = height
				+ ((fragLv.getDividerHeight()) * (adapter.getCount() - 1));
		fragLv.setLayoutParams(params);
	}

	/**
	 * 保存当前用户状态
	 * 
	 * @param
	 */
	public static void setStates(boolean state) {
		AppUtils.isUserState = state;
	}

	public static void getStates(boolean state) {
		AppUtils.isUserState = state;
	}

}
