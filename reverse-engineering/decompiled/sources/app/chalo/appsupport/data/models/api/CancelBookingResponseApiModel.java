package app.chalo.appsupport.data.models.api;

import defpackage.wb;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/appsupport/data/models/api/CancelBookingResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CancelBookingResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new wb(28)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancelBookingApiStatus f978a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/appsupport/data/models/api/CancelBookingResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/appsupport/data/models/api/CancelBookingResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CancelBookingResponseApiModel> serializer() {
            return CancelBookingResponseApiModel$$serializer.f979a;
        }
    }

    public /* synthetic */ CancelBookingResponseApiModel(int i, CancelBookingApiStatus cancelBookingApiStatus, String str) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(CancelBookingResponseApiModel$$serializer.f979a.getDescriptor(), i, 1);
            throw null;
        }
        this.f978a = cancelBookingApiStatus;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelBookingResponseApiModel)) {
            return false;
        }
        CancelBookingResponseApiModel cancelBookingResponseApiModel = (CancelBookingResponseApiModel) obj;
        return this.f978a == cancelBookingResponseApiModel.f978a && Intrinsics.d(this.b, cancelBookingResponseApiModel.b);
    }

    public final int hashCode() {
        int iHashCode = this.f978a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CancelBookingResponseApiModel(status=" + this.f978a + ", message=" + this.b + ")";
    }
}
