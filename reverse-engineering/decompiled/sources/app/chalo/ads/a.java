package app.chalo.ads;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdsterFixedBannerAnalyticsHelper f857a;
    public final /* synthetic */ String b;
    public final /* synthetic */ BannerAdSlot c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ MutableState f;
    public final /* synthetic */ MutableIntState g;

    public /* synthetic */ a(AdsterFixedBannerAnalyticsHelper adsterFixedBannerAnalyticsHelper, String str, BannerAdSlot bannerAdSlot, String str2, Function2 function2, MutableState mutableState, MutableIntState mutableIntState) {
        this.f857a = adsterFixedBannerAnalyticsHelper;
        this.b = str;
        this.c = bannerAdSlot;
        this.d = str2;
        this.e = function2;
        this.f = mutableState;
        this.g = mutableIntState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        Integer num2 = (Integer) obj2;
        int iIntValue2 = num2.intValue();
        MutableState mutableState = this.f;
        if (!((Boolean) mutableState.getValue()).booleanValue()) {
            AdsterFixedBannerAnalyticsHelper adsterFixedBannerAnalyticsHelper = this.f857a;
            adsterFixedBannerAnalyticsHelper.getClass();
            String adUnitId = this.b;
            Intrinsics.i(adUnitId, "adUnitId");
            BannerAdSlot slot = this.c;
            Intrinsics.i(slot, "slot");
            AdsterFixedBannerAnalyticsHelper.c(adsterFixedBannerAnalyticsHelper, adUnitId, slot);
            throw null;
        }
        MutableIntState mutableIntState = this.g;
        mutableIntState.setIntValue(Math.max(mutableIntState.getIntValue(), iIntValue2));
        mutableState.setValue(Boolean.TRUE);
        String message = this.d + " measured widthDp=" + iIntValue + " heightDp=" + iIntValue2 + " reservedHeightDp=" + mutableIntState.getIntValue();
        Intrinsics.i(message, "message");
        Function2 function2 = this.e;
        if (function2 != null) {
            function2.invoke(num, num2);
        }
        return Unit.f17538a;
    }
}
