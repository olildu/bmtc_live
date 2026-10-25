package app.chalo.productbooking.common.data.models.api.response;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/OriginDestinationStopApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OriginDestinationStopApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8141a;
    public final String b;
    public final Double c;
    public final Double d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/api/response/OriginDestinationStopApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/OriginDestinationStopApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OriginDestinationStopApiModel> serializer() {
            return OriginDestinationStopApiModel$$serializer.f8142a;
        }
    }

    public /* synthetic */ OriginDestinationStopApiModel(int i, String str, String str2, Double d, Double d2, String str3) {
        if ((i & 1) == 0) {
            this.f8141a = null;
        } else {
            this.f8141a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final StopAppModel a(ChaloTransitMode mode) {
        String str;
        Double d;
        Double d2;
        Intrinsics.i(mode, "mode");
        String str2 = this.f8141a;
        if (str2 == null || (str = this.b) == null || (d = this.c) == null || (d2 = this.d) == null) {
            return null;
        }
        return new StopAppModel(str2, str, new LatLng(d.doubleValue(), d2.doubleValue()), mode, this.e, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginDestinationStopApiModel)) {
            return false;
        }
        OriginDestinationStopApiModel originDestinationStopApiModel = (OriginDestinationStopApiModel) obj;
        return Intrinsics.d(this.f8141a, originDestinationStopApiModel.f8141a) && Intrinsics.d(this.b, originDestinationStopApiModel.b) && Intrinsics.d(this.c, originDestinationStopApiModel.c) && Intrinsics.d(this.d, originDestinationStopApiModel.d) && Intrinsics.d(this.e, originDestinationStopApiModel.e);
    }

    public final int hashCode() {
        String str = this.f8141a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.c;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.d;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("OriginDestinationStopApiModel(id=", this.f8141a, ", name=", this.b, ", lat=");
        sbE.append(this.c);
        sbE.append(", lon=");
        sbE.append(this.d);
        sbE.append(", address=");
        return vo1.p(sbE, this.e, ")");
    }
}
