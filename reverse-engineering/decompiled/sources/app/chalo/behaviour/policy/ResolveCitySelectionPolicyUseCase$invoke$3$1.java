package app.chalo.behaviour.policy;

import app.chalo.location.LatLng;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.iconassetprovider.IconTypeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class ResolveCitySelectionPolicyUseCase$invoke$3$1 extends FunctionReferenceImpl implements Function2<ResolvedCitySelectionPolicy, CitySelectionPolicyOverride, ResolvedCitySelectionPolicy> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResolveCitySelectionPolicyUseCase$invoke$3$1 f1039a = new ResolveCitySelectionPolicyUseCase$invoke$3$1();

    public ResolveCitySelectionPolicyUseCase$invoke$3$1() {
        super(2, CitySelectionPolicyKt.class, "with", "with(Lapp/chalo/behaviour/policy/ResolvedCitySelectionPolicy;Lapp/chalo/behaviour/policy/CitySelectionPolicyOverride;)Lapp/chalo/behaviour/policy/ResolvedCitySelectionPolicy;", 1);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        IconType iconTypeA;
        Set cityIdsWithDisabledCityChange;
        Set validAutoSelectionCityIds;
        ResolvedCitySelectionPolicy p0 = (ResolvedCitySelectionPolicy) obj;
        CitySelectionPolicyOverride citySelectionPolicyOverride = (CitySelectionPolicyOverride) obj2;
        Intrinsics.i(p0, "p0");
        if (citySelectionPolicyOverride == null) {
            return p0;
        }
        String str = citySelectionPolicyOverride.e;
        if (str == null || (iconTypeA = IconTypeUtils.a(str)) == null) {
            iconTypeA = p0.e;
        }
        IconType iconType = iconTypeA;
        Set set = citySelectionPolicyOverride.f1001a;
        if (set != null) {
            Set set2 = set;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                arrayList.add(lowerCase);
            }
            cityIdsWithDisabledCityChange = CollectionsKt.G0(arrayList);
            if (cityIdsWithDisabledCityChange == null) {
                cityIdsWithDisabledCityChange = p0.f1070a;
            } else {
                if (cityIdsWithDisabledCityChange.isEmpty()) {
                    cityIdsWithDisabledCityChange = null;
                }
                if (cityIdsWithDisabledCityChange == null) {
                    cityIdsWithDisabledCityChange = p0.f1070a;
                }
            }
        } else {
            cityIdsWithDisabledCityChange = p0.f1070a;
        }
        Boolean bool = citySelectionPolicyOverride.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : p0.b;
        Set set3 = citySelectionPolicyOverride.c;
        if (set3 != null) {
            Set set4 = set3;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(set4, 10));
            Iterator it2 = set4.iterator();
            while (it2.hasNext()) {
                String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase2, "toLowerCase(...)");
                arrayList2.add(lowerCase2);
            }
            Set setG0 = CollectionsKt.G0(arrayList2);
            if (setG0 == null) {
                validAutoSelectionCityIds = p0.c;
            } else {
                validAutoSelectionCityIds = setG0.isEmpty() ? null : setG0;
                if (validAutoSelectionCityIds == null) {
                    validAutoSelectionCityIds = p0.c;
                }
            }
        } else {
            validAutoSelectionCityIds = p0.c;
        }
        LatLng latLng = citySelectionPolicyOverride.d;
        if (latLng == null) {
            latLng = p0.d;
        }
        LatLng latLng2 = latLng;
        Boolean bool2 = citySelectionPolicyOverride.f;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : p0.f;
        TicketReceiptFormatConfig ticketReceiptFormatConfig = citySelectionPolicyOverride.g;
        if (ticketReceiptFormatConfig == null) {
            ticketReceiptFormatConfig = p0.g;
        }
        TicketReceiptFormatConfig ticketReceiptFormat = ticketReceiptFormatConfig;
        Intrinsics.i(cityIdsWithDisabledCityChange, "cityIdsWithDisabledCityChange");
        Intrinsics.i(validAutoSelectionCityIds, "validAutoSelectionCityIds");
        Intrinsics.i(ticketReceiptFormat, "ticketReceiptFormat");
        return new ResolvedCitySelectionPolicy(cityIdsWithDisabledCityChange, zBooleanValue, validAutoSelectionCityIds, latLng2, iconType, zBooleanValue2, ticketReceiptFormat);
    }
}
