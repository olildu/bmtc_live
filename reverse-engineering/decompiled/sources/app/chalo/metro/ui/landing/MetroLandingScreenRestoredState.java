package app.chalo.metro.ui.landing;

import app.chalo.citydata.data.model.app.StopAppModel;
import defpackage.d;
import defpackage.dd;
import defpackage.hq0;
import defpackage.sg0;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenRestoredState;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetroLandingScreenRestoredState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5493a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final PickStopRequestType e;
    public final Map f;
    public final List g;
    public final MetroLineListItemState h;
    public final StopAppModel i;
    public final StopAppModel j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenRestoredState$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenRestoredState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetroLandingScreenRestoredState> serializer() {
            return MetroLandingScreenRestoredState$$serializer.f5494a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        k = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new sg0(25)), LazyKt.a(lazyThreadSafetyMode, new sg0(26)), LazyKt.a(lazyThreadSafetyMode, new sg0(27)), null, null, null};
    }

    public /* synthetic */ MetroLandingScreenRestoredState(int i, String str, String str2, Boolean bool, String str3, PickStopRequestType pickStopRequestType, Map map, List list, MetroLineListItemState metroLineListItemState, StopAppModel stopAppModel, StopAppModel stopAppModel2) {
        if (16 != (i & 16)) {
            PluginExceptionsKt.b(MetroLandingScreenRestoredState$$serializer.f5494a.getDescriptor(), i, 16);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f5493a = null;
        } else {
            this.f5493a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = pickStopRequestType;
        if ((i & 32) == 0) {
            this.f = MapsKt.d();
        } else {
            this.f = map;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = metroLineListItemState;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = stopAppModel;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = stopAppModel2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroLandingScreenRestoredState)) {
            return false;
        }
        MetroLandingScreenRestoredState metroLandingScreenRestoredState = (MetroLandingScreenRestoredState) obj;
        return Intrinsics.d(this.f5493a, metroLandingScreenRestoredState.f5493a) && Intrinsics.d(this.b, metroLandingScreenRestoredState.b) && Intrinsics.d(this.c, metroLandingScreenRestoredState.c) && Intrinsics.d(this.d, metroLandingScreenRestoredState.d) && this.e == metroLandingScreenRestoredState.e && Intrinsics.d(this.f, metroLandingScreenRestoredState.f) && Intrinsics.d(this.g, metroLandingScreenRestoredState.g) && Intrinsics.d(this.h, metroLandingScreenRestoredState.h) && Intrinsics.d(this.i, metroLandingScreenRestoredState.i) && Intrinsics.d(this.j, metroLandingScreenRestoredState.j);
    }

    public final int hashCode() {
        String str = this.f5493a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.d;
        int iF = d.f(this.f, (this.e.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31);
        List list = this.g;
        int iHashCode4 = (iF + (list == null ? 0 : list.hashCode())) * 31;
        MetroLineListItemState metroLineListItemState = this.h;
        int iHashCode5 = (iHashCode4 + (metroLineListItemState == null ? 0 : metroLineListItemState.hashCode())) * 31;
        StopAppModel stopAppModel = this.i;
        int iHashCode6 = (iHashCode5 + (stopAppModel == null ? 0 : stopAppModel.hashCode())) * 31;
        StopAppModel stopAppModel2 = this.j;
        return iHashCode6 + (stopAppModel2 != null ? stopAppModel2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MetroLandingScreenRestoredState(ondcConfigId=", this.f5493a, ", ondcAgencyName=", this.b, ", isRouteBasedFlow=");
        hq0.t(this.c, ", pickStopRequestId=", this.d, ", pickStopRequestType=", sbE);
        sbE.append(this.e);
        sbE.append(", linesToStopListMap=");
        sbE.append(this.f);
        sbE.append(", metroLineItemStateList=");
        sbE.append(this.g);
        sbE.append(", selectedLine=");
        sbE.append(this.h);
        sbE.append(", selectedFromStation=");
        sbE.append(this.i);
        sbE.append(", selectedToStation=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }

    public MetroLandingScreenRestoredState(String str, String str2, Boolean bool, String str3, PickStopRequestType pickStopRequestType, Map map, List list, MetroLineListItemState metroLineListItemState, StopAppModel stopAppModel, StopAppModel stopAppModel2) {
        Intrinsics.i(pickStopRequestType, "pickStopRequestType");
        this.f5493a = str;
        this.b = str2;
        this.c = bool;
        this.d = str3;
        this.e = pickStopRequestType;
        this.f = map;
        this.g = list;
        this.h = metroLineListItemState;
        this.i = stopAppModel;
        this.j = stopAppModel2;
    }
}
