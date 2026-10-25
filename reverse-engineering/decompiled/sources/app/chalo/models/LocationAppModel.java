package app.chalo.models;

import app.chalo.location.LatLng;
import defpackage.n21;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/LocationAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LocationAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5586a;
    public final double b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/LocationAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/LocationAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LocationAppModel> serializer() {
            return LocationAppModel$$serializer.f5587a;
        }
    }

    public LocationAppModel(double d, double d2) {
        this.f5586a = d;
        this.b = d2;
    }

    public final LatLng a() {
        return new LatLng(this.f5586a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationAppModel)) {
            return false;
        }
        LocationAppModel locationAppModel = (LocationAppModel) obj;
        return Double.compare(this.f5586a, locationAppModel.f5586a) == 0 && Double.compare(this.b, locationAppModel.b) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f5586a);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        return i + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        StringBuilder sbI = n21.i(this.f5586a, "LocationAppModel(latitude=", ", longitude=");
        sbI.append(this.b);
        sbI.append(")");
        return sbI.toString();
    }

    public /* synthetic */ LocationAppModel(int i, double d, double d2) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(LocationAppModel$$serializer.f5587a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5586a = d;
        this.b = d2;
    }
}
