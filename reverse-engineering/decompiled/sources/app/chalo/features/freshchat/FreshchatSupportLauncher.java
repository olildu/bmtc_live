package app.chalo.features.freshchat;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.userprofile.UserProfileAppModel;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/freshchat/FreshchatSupportLauncher;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreshchatSupportLauncher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreshchatUserInteractionContract f2717a;
    public final CityProvider b;
    public final UserProfileDetailsProvider c;
    public final AnalyticsContract d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/features/freshchat/FreshchatSupportLauncher$Companion;", "", "", "TAG", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final void a(String message) {
            Intrinsics.i(message, "message");
        }
    }

    public FreshchatSupportLauncher(FreshchatUserInteractionContract freshchatUserInteractionContract, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, AnalyticsContract analyticsContract) {
        this.f2717a = freshchatUserInteractionContract;
        this.b = cityProvider;
        this.c = userProfileDetailsProvider;
        this.d = analyticsContract;
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        CityProvider cityProvider = this.b;
        String strB = CityProviderKt.b(cityProvider);
        if (strB != null) {
            String lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        arrayList.add("commontag");
        Companion.a("buildTagList=" + arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strB2 = CityProviderKt.b(cityProvider);
        if (strB2 != null) {
            linkedHashMap.put("userPropertyCity", strB2);
        }
        UserProfileAppModel userProfileAppModelF = this.c.f();
        if (userProfileAppModelF != null) {
            String str = userProfileAppModelF.i;
            String str2 = userProfileAppModelF.e;
            if (str2.length() > 0) {
                linkedHashMap.put("userPropertyPhoneNo", str2);
            }
            if (str.length() > 0) {
                linkedHashMap.put("userPropertyUserID", str);
            }
            String strA = userProfileAppModelF.a();
            if (strA.length() > 0) {
                linkedHashMap.put("userPropertyUserName", strA);
            }
        }
        Companion.a("buildUserProperties keys=" + linkedHashMap.keySet());
        Companion.a("launch tags=" + arrayList + " propsKeys=" + linkedHashMap.keySet());
        boolean zIsEmpty = linkedHashMap.isEmpty();
        FreshchatUserInteractionContract freshchatUserInteractionContract = this.f2717a;
        if (!zIsEmpty) {
            freshchatUserInteractionContract.d(linkedHashMap);
        }
        freshchatUserInteractionContract.c(arrayList, true, "Help and Support", "category");
        Source source = Source.DEEPLINK_HELPER;
        AnalyticsContract.DefaultImpls.a(this.d, "chat screen", source.getSourceName(), vo1.s("source", source.getSourceName()), null, false, 24);
    }
}
