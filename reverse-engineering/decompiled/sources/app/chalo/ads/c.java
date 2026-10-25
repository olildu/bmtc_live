package app.chalo.ads;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.component.KoinComponent;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements OnPaidEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f859a;
    public final /* synthetic */ String b;
    public final /* synthetic */ BannerAdSlot c;
    public final /* synthetic */ AdManagerAdView d;
    public final /* synthetic */ KoinComponent e;

    public /* synthetic */ c(KoinComponent koinComponent, String str, BannerAdSlot bannerAdSlot, AdManagerAdView adManagerAdView, int i) {
        this.f859a = i;
        this.e = koinComponent;
        this.b = str;
        this.c = bannerAdSlot;
        this.d = adManagerAdView;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        String responseId;
        String responseId2;
        switch (this.f859a) {
            case 0:
                FixedBannerAdAnalyticsHelper fixedBannerAdAnalyticsHelper = (FixedBannerAdAnalyticsHelper) this.e;
                ResponseInfo responseInfo = this.d.getResponseInfo();
                fixedBannerAdAnalyticsHelper.getClass();
                String adUnitId = this.b;
                Intrinsics.i(adUnitId, "adUnitId");
                BannerAdSlot slot = this.c;
                Intrinsics.i(slot, "slot");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (adValue != null) {
                    linkedHashMap.put("valueMicros", Long.valueOf(adValue.getValueMicros()));
                    linkedHashMap.put("currencyCode", adValue.getCurrencyCode());
                    linkedHashMap.put("precision", Integer.valueOf(adValue.getPrecisionType()));
                }
                if (responseInfo != null && (responseId = responseInfo.getResponseId()) != null) {
                    linkedHashMap.put("responseId", responseId);
                }
                FixedBannerAdAnalyticsHelper.a(new FixedBannerAdAnalyticsMetadata(adUnitId, slot), linkedHashMap);
                throw null;
            default:
                BannerAdAnalyticsHelper bannerAdAnalyticsHelper = (BannerAdAnalyticsHelper) this.e;
                ResponseInfo responseInfo2 = this.d.getResponseInfo();
                bannerAdAnalyticsHelper.getClass();
                String adUnitId2 = this.b;
                Intrinsics.i(adUnitId2, "adUnitId");
                BannerAdSlot slot2 = this.c;
                Intrinsics.i(slot2, "slot");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (adValue != null) {
                    linkedHashMap2.put("valueMicros", Long.valueOf(adValue.getValueMicros()));
                    linkedHashMap2.put("currencyCode", adValue.getCurrencyCode());
                    linkedHashMap2.put("precision", Integer.valueOf(adValue.getPrecisionType()));
                }
                if (responseInfo2 != null && (responseId2 = responseInfo2.getResponseId()) != null) {
                    linkedHashMap2.put("responseId", responseId2);
                }
                bannerAdAnalyticsHelper.a("ad paid impression", new BannerAdAnalyticsMetadata(adUnitId2, slot2), linkedHashMap2);
                return;
        }
    }
}
