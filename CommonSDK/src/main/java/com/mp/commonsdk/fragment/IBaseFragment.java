package com.mp.commonsdk.fragment;

/**
 * provide some method to make Fragment act like Activity in BackStack
 * <p/>
 * When a Fragment becomes invisible totally, {@link #onLeave} will be called.
 * <p/>
 * When a Fragment becomes visible from totally invisible, {@link #onBack()} or {@link #onBackWithData(Object)} will be called.
 */
public interface IBaseFragment {

    /**
     *
     * @param data
     */
    void onEnter(Object data);

    void onLeave();

    void onBack();

    void onBackWithData(Object data);

    /**
     * process the return back logic
     * return true if back pressed event has been processed and should stay in current view
     *
     * @return
     */
    boolean processBackPressed();
}