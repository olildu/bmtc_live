package app.chalo.features.adjust;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.userprofile.UserProfileAppModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdjustManagerImpl f2627a;

    public /* synthetic */ a(AdjustManagerImpl adjustManagerImpl) {
        this.f2627a = adjustManagerImpl;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        AdjustManagerImpl adjustManagerImpl = this.f2627a;
        AnalyticsContract analyticsContract = adjustManagerImpl.c;
        CommonAdjustAttribution commonAdjustAttribution = (CommonAdjustAttribution) obj;
        String str10 = "";
        if (commonAdjustAttribution == null || (str = commonAdjustAttribution.c) == null) {
            str = "";
        }
        Pair pair = new Pair("[Adjust]Network", str);
        if (commonAdjustAttribution == null || (str2 = commonAdjustAttribution.d) == null) {
            str2 = "";
        }
        Pair pair2 = new Pair("[Adjust]Campaign", str2);
        if (commonAdjustAttribution == null || (str3 = commonAdjustAttribution.e) == null) {
            str3 = "";
        }
        Pair pair3 = new Pair("[Adjust]Adgroup", str3);
        if (commonAdjustAttribution == null || (str4 = commonAdjustAttribution.f) == null) {
            str4 = "";
        }
        Pair pair4 = new Pair("[Adjust]Creative", str4);
        if (commonAdjustAttribution == null || (str5 = commonAdjustAttribution.b) == null) {
            str5 = "";
        }
        Map mapI = MapsKt.i(pair, pair2, pair3, pair4, new Pair("[Adjust]TrackerName", str5));
        if (commonAdjustAttribution == null || (str6 = commonAdjustAttribution.g) == null) {
            str6 = "";
        }
        CoroutineContextProvider coroutineContextProvider = adjustManagerImpl.g;
        ContextScope contextScope = adjustManagerImpl.k;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List listU = StringsKt.U(str6, new String[]{","}, 6);
        String str11 = (String) CollectionsKt.L(0, listU);
        String str12 = (String) CollectionsKt.L(1, listU);
        if (str11 != null) {
            linkedHashMap.put("[Adjust]ReferrerDeviceId", str11);
            linkedHashMap2.put("[Adjust]ReferrerDeviceId", str11);
        }
        if (str12 != null) {
            linkedHashMap.put("[Adjust]ReferrerMobileNumber", str12);
            linkedHashMap2.put("[Adjust]ReferrerMobileNumber", str12);
        }
        UserProfileAppModel userProfileAppModelF = adjustManagerImpl.e.f();
        if (userProfileAppModelF == null || (str7 = userProfileAppModelF.e) == null) {
            str7 = "";
        }
        linkedHashMap2.put("[Adjust]ReferredMobileNumber", str7);
        linkedHashMap2.put("[Adjust]ReferredDeviceId", adjustManagerImpl.d.getDeviceId());
        Source source = Source.ADJUST;
        AnalyticsContract.DefaultImpls.a(analyticsContract, "Adjust Label Info Received", source.getSourceName(), linkedHashMap2, null, false, 24);
        LinkedHashMap linkedHashMapL = MapsKt.l(mapI, MapsKt.r(linkedHashMap));
        adjustManagerImpl.j = linkedHashMapL;
        analyticsContract.a(linkedHashMapL);
        if (commonAdjustAttribution == null || (str8 = commonAdjustAttribution.d) == null) {
            str8 = "";
        }
        BuildersKt.d(contextScope, coroutineContextProvider.b(), null, new AdjustManagerImpl$saveAdjustCampaignName$1(adjustManagerImpl, str8, null), 2);
        if (commonAdjustAttribution != null && (str9 = commonAdjustAttribution.c) != null) {
            str10 = str9;
        }
        BuildersKt.d(contextScope, coroutineContextProvider.b(), null, new AdjustManagerImpl$saveAdjustAcquisitionChannelName$1(adjustManagerImpl, str10, null), 2);
        AnalyticsContract.DefaultImpls.a(analyticsContract, "Adjust Attribution Received", source.getSourceName(), adjustManagerImpl.j, null, false, 24);
        return Unit.f17538a;
    }
}
