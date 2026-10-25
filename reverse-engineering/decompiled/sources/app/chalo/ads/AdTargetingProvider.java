package app.chalo.ads;

import app.chalo.contract.BasicInfoContract;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import app.chalo.location.LastKnownLocationProvider;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import com.adjust.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ads/AdTargetingProvider;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdTargetingProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f720a;
    public final LanguageFeature b;
    public final LastKnownLocationProvider c;
    public final BasicInfoContract d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ads/AdTargetingProvider$Companion;", "", "", "TAG", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public AdTargetingProvider(CityProvider cityProvider, LanguageFeature languageFeature, LastKnownLocationProvider lastKnownLocationProvider, BasicInfoContract basicInfoContract) {
        this.f720a = cityProvider;
        this.b = languageFeature;
        this.c = lastKnownLocationProvider;
        this.d = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Map map, ContinuationImpl continuationImpl) throws Throwable {
        AdTargetingProvider$buildTargeting$1 adTargetingProvider$buildTargeting$1;
        Map map2;
        Map map3;
        String locale;
        String string;
        String string2;
        if (continuationImpl instanceof AdTargetingProvider$buildTargeting$1) {
            adTargetingProvider$buildTargeting$1 = (AdTargetingProvider$buildTargeting$1) continuationImpl;
            int i = adTargetingProvider$buildTargeting$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                adTargetingProvider$buildTargeting$1.label = i - Integer.MIN_VALUE;
            } else {
                adTargetingProvider$buildTargeting$1 = new AdTargetingProvider$buildTargeting$1(this, continuationImpl);
            }
        } else {
            adTargetingProvider$buildTargeting$1 = new AdTargetingProvider$buildTargeting$1(this, continuationImpl);
        }
        Object obj = adTargetingProvider$buildTargeting$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = adTargetingProvider$buildTargeting$1.label;
        if (i2 == 0) {
            LinkedHashMap linkedHashMapO = defpackage.d.o(obj);
            String strB = CityProviderKt.b(this.f720a);
            if (strB != null && (string2 = StringsKt.u0(strB).toString()) != null) {
                String lowerCase = string2.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                if (lowerCase.length() <= 0) {
                    lowerCase = null;
                }
                if (lowerCase != null) {
                    linkedHashMapO.put("selectedCity", lowerCase);
                }
            }
            Language language = (Language) this.b.h().getValue();
            if (language != null && (locale = language.getLocale()) != null && (string = StringsKt.u0(locale).toString()) != null) {
                String lowerCase2 = string.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase2, "toLowerCase(...)");
                String str = lowerCase2.length() > 0 ? lowerCase2 : null;
                if (str != null) {
                    linkedHashMapO.put("language", str);
                }
            }
            adTargetingProvider$buildTargeting$1.L$0 = map;
            adTargetingProvider$buildTargeting$1.L$1 = linkedHashMapO;
            adTargetingProvider$buildTargeting$1.label = 1;
            int i3 = LastKnownLocationProvider.e;
            Object objA = this.c.a(2, 600000L, adTargetingProvider$buildTargeting$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            map2 = map;
            map3 = linkedHashMapO;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map3 = (Map) adTargetingProvider$buildTargeting$1.L$1;
            map2 = (Map) adTargetingProvider$buildTargeting$1.L$0;
            ResultKt.b(obj);
        }
        LatLng latLng = (LatLng) obj;
        if (latLng != null) {
            map3.put("lat", String.valueOf(latLng.f5134a));
            map3.put(Constants.LONG, String.valueOf(latLng.b));
        }
        map3.put("versionCode", String.valueOf(this.d.h()));
        for (Map.Entry entry : map2.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            String string3 = StringsKt.u0(str2).toString();
            String string4 = StringsKt.u0(str3).toString();
            if (string3.length() > 0 && string4.length() > 0) {
                map3.put(string3, string4);
            }
        }
        Map mapR = MapsKt.r(map3);
        try {
            String message = "Ad targeting keys=" + CollectionsKt.u0(mapR.keySet()) + " count=" + mapR.size();
            Intrinsics.i(message, "message");
            return mapR;
        } catch (Throwable th) {
            ResultKt.a(th);
            return mapR;
        }
    }
}
