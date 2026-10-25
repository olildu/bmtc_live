package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.ComposeView;
import app.chalo.ads.NativeAdViewKt;
import com.google.android.gms.ads.nativead.NativeAdView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15653a;
    public final /* synthetic */ NativeAdView b;
    public final /* synthetic */ ComposeView c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ fl0(NativeAdView nativeAdView, ComposeView composeView, Function2 function2, int i) {
        this.f15653a = i;
        this.b = nativeAdView;
        this.c = composeView;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15653a;
        Function2<? super Composer, ? super Integer, Unit> function2 = this.d;
        ComposeView composeView = this.c;
        NativeAdView nativeAdView = this.b;
        Context it = (Context) obj;
        switch (i) {
            case 0:
                ProvidableCompositionLocal providableCompositionLocal = NativeAdViewKt.f801a;
                Intrinsics.i(it, "it");
                nativeAdView.setBodyView(composeView);
                composeView.setContent(function2);
                break;
            case 1:
                ProvidableCompositionLocal providableCompositionLocal2 = NativeAdViewKt.f801a;
                Intrinsics.i(it, "it");
                nativeAdView.setCallToActionView(composeView);
                composeView.setContent(function2);
                break;
            default:
                ProvidableCompositionLocal providableCompositionLocal3 = NativeAdViewKt.f801a;
                Intrinsics.i(it, "it");
                nativeAdView.setHeadlineView(composeView);
                composeView.setContent(function2);
                break;
        }
        return composeView;
    }
}
