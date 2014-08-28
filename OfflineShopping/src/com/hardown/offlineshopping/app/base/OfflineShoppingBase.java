package com.hardown.offlineshopping.app.base;

import android.R.id;
import android.os.Bundle;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;
import com.hardown.offlineshopping.app.activity.R;

public class OfflineShoppingBase extends SherlockFragmentActivity{
	ActionBar mActionBar;
	@Override
	protected void onCreate(Bundle saveInstance) {
		setTheme(R.style.AppTheme);
		super.onCreate(saveInstance);
		creteActionBar();
	}

	private void creteActionBar() {
		mActionBar = getSupportActionBar();
		
		mActionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.actionbar_icon));
		mActionBar.setDisplayHomeAsUpEnabled(true);
		mActionBar.setTitle("Offline Shop");
		mActionBar.setDisplayUseLogoEnabled(true);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == android.R.id.home){
			super.onBackPressed();
		}
		return true;
	}

}
