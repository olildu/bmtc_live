package app.chalo.behaviour.policy;

import app.chalo.location.LatLng;
import app.chalo.providers.iconassetprovider.IconType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/behaviour/policy/ResolvedCitySelectionPolicy;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResolvedCitySelectionPolicy {
    public static final ResolvedCitySelectionPolicy h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f1070a;
    public final boolean b;
    public final Set c;
    public final LatLng d;
    public final IconType e;
    public final boolean f;
    public final TicketReceiptFormatConfig g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/ResolvedCitySelectionPolicy$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        EmptySet emptySet = EmptySet.f17559a;
        h = new ResolvedCitySelectionPolicy(emptySet, true, emptySet, null, null, false, TicketReceiptFormatConfig.COMMON);
    }

    public ResolvedCitySelectionPolicy(Set cityIdsWithDisabledCityChange, boolean z, Set validAutoSelectionCityIds, LatLng latLng, IconType iconType, boolean z2, TicketReceiptFormatConfig ticketReceiptFormat) {
        Intrinsics.i(cityIdsWithDisabledCityChange, "cityIdsWithDisabledCityChange");
        Intrinsics.i(validAutoSelectionCityIds, "validAutoSelectionCityIds");
        Intrinsics.i(ticketReceiptFormat, "ticketReceiptFormat");
        this.f1070a = cityIdsWithDisabledCityChange;
        this.b = z;
        this.c = validAutoSelectionCityIds;
        this.d = latLng;
        this.e = iconType;
        this.f = z2;
        this.g = ticketReceiptFormat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedCitySelectionPolicy)) {
            return false;
        }
        ResolvedCitySelectionPolicy resolvedCitySelectionPolicy = (ResolvedCitySelectionPolicy) obj;
        return Intrinsics.d(this.f1070a, resolvedCitySelectionPolicy.f1070a) && this.b == resolvedCitySelectionPolicy.b && Intrinsics.d(this.c, resolvedCitySelectionPolicy.c) && Intrinsics.d(this.d, resolvedCitySelectionPolicy.d) && this.e == resolvedCitySelectionPolicy.e && this.f == resolvedCitySelectionPolicy.f && this.g == resolvedCitySelectionPolicy.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + (((this.f1070a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31)) * 31;
        LatLng latLng = this.d;
        int iHashCode2 = (iHashCode + (latLng == null ? 0 : latLng.hashCode())) * 31;
        IconType iconType = this.e;
        return this.g.hashCode() + ((((iHashCode2 + (iconType != null ? iconType.hashCode() : 0)) * 31) + (this.f ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "ResolvedCitySelectionPolicy(cityIdsWithDisabledCityChange=" + this.f1070a + ", isCityDiscontinuedOptionAvailable=" + this.b + ", validAutoSelectionCityIds=" + this.c + ", autoSelectionLocation=" + this.d + ", welcomeScreenIcon=" + this.e + ", useUpdatedHomeScreenProductPurchaseCards=" + this.f + ", ticketReceiptFormat=" + this.g + ")";
    }
}
