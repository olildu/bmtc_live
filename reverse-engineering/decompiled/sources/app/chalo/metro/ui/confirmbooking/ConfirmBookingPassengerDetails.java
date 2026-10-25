package app.chalo.metro.ui.confirmbooking;

import defpackage.b3;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingPassengerDetails;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ConfirmBookingPassengerDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5461a;
    public final String b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingPassengerDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingPassengerDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ConfirmBookingPassengerDetails> serializer() {
            return ConfirmBookingPassengerDetails$$serializer.f5462a;
        }
    }

    public /* synthetic */ ConfirmBookingPassengerDetails(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(ConfirmBookingPassengerDetails$$serializer.f5462a.getDescriptor(), i, 7);
            throw null;
        }
        this.f5461a = str;
        this.b = str2;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmBookingPassengerDetails)) {
            return false;
        }
        ConfirmBookingPassengerDetails confirmBookingPassengerDetails = (ConfirmBookingPassengerDetails) obj;
        return Intrinsics.d(this.f5461a, confirmBookingPassengerDetails.f5461a) && Intrinsics.d(this.b, confirmBookingPassengerDetails.b) && this.c == confirmBookingPassengerDetails.c;
    }

    public final int hashCode() {
        return nf1.e(this.f5461a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        return b3.f(")", this.c, dd.e("ConfirmBookingPassengerDetails(id=", this.f5461a, ", name=", this.b, ", count="));
    }

    public ConfirmBookingPassengerDetails(String str, String str2, int i) {
        this.f5461a = str;
        this.b = str2;
        this.c = i;
    }
}
