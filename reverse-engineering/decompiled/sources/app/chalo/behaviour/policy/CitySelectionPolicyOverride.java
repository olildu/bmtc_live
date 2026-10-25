package app.chalo.behaviour.policy;

import app.chalo.location.LatLng;
import defpackage.ep;
import defpackage.gf;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/behaviour/policy/CitySelectionPolicyOverride;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CitySelectionPolicyOverride {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f1001a;
    public final Boolean b;
    public final Set c;
    public final LatLng d;
    public final String e;
    public final Boolean f;
    public final TicketReceiptFormatConfig g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/behaviour/policy/CitySelectionPolicyOverride$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/behaviour/policy/CitySelectionPolicyOverride;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CitySelectionPolicyOverride> serializer() {
            return CitySelectionPolicyOverride$$serializer.f1002a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new ep(0)), null, LazyKt.a(lazyThreadSafetyMode, new ep(1)), null, null, null, LazyKt.a(lazyThreadSafetyMode, new ep(2))};
    }

    public /* synthetic */ CitySelectionPolicyOverride(int i, Set set, Boolean bool, Set set2, LatLng latLng, String str, Boolean bool2, TicketReceiptFormatConfig ticketReceiptFormatConfig) {
        if ((i & 1) == 0) {
            this.f1001a = null;
        } else {
            this.f1001a = set;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = set2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = latLng;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = ticketReceiptFormatConfig;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CitySelectionPolicyOverride)) {
            return false;
        }
        CitySelectionPolicyOverride citySelectionPolicyOverride = (CitySelectionPolicyOverride) obj;
        return Intrinsics.d(this.f1001a, citySelectionPolicyOverride.f1001a) && Intrinsics.d(this.b, citySelectionPolicyOverride.b) && Intrinsics.d(this.c, citySelectionPolicyOverride.c) && Intrinsics.d(this.d, citySelectionPolicyOverride.d) && Intrinsics.d(this.e, citySelectionPolicyOverride.e) && Intrinsics.d(this.f, citySelectionPolicyOverride.f) && this.g == citySelectionPolicyOverride.g;
    }

    public final int hashCode() {
        Set set = this.f1001a;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Set set2 = this.c;
        int iHashCode3 = (iHashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        LatLng latLng = this.d;
        int iHashCode4 = (iHashCode3 + (latLng == null ? 0 : latLng.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        TicketReceiptFormatConfig ticketReceiptFormatConfig = this.g;
        return iHashCode6 + (ticketReceiptFormatConfig != null ? ticketReceiptFormatConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CitySelectionPolicyOverride(cityIdsWithDisabledCityChange=");
        sb.append(this.f1001a);
        sb.append(", isCityDiscontinuedOptionAvailable=");
        sb.append(this.b);
        sb.append(", validAutoSelectionCityIds=");
        sb.append(this.c);
        sb.append(", autoSelectionLocation=");
        sb.append(this.d);
        sb.append(", welcomeScreenIcon=");
        gf.v(this.f, this.e, ", useUpdatedHomeScreenProductPurchaseCards=", ", ticketReceiptFormat=", sb);
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public CitySelectionPolicyOverride(Set set, Set set2, LatLng latLng, TicketReceiptFormatConfig ticketReceiptFormatConfig) {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        this.f1001a = set;
        this.b = bool;
        this.c = set2;
        this.d = latLng;
        this.e = "BENGALURU_WELCOME_IMAGE";
        this.f = bool2;
        this.g = ticketReceiptFormatConfig;
    }
}
