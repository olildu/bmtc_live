package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import in.juspay.hypersdk.core.CustomLinkMovementMethod;
import in.juspay.hypersdk.core.InflateView;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class oa0 implements CustomLinkMovementMethod.OnLinkClickListener, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InflateView f18581a;
    public final /* synthetic */ String b;

    public /* synthetic */ oa0(InflateView inflateView, String str) {
        this.f18581a = inflateView;
        this.b = str;
    }

    @Override // in.juspay.hypersdk.core.CustomLinkMovementMethod.OnLinkClickListener
    public void onLinkClick(String str) {
        this.f18581a.lambda$parseKeys$6(this.b, str);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        this.f18581a.lambda$parseKeys$7(this.b);
    }
}
