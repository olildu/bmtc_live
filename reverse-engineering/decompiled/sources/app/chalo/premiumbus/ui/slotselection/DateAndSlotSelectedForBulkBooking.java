package app.chalo.premiumbus.ui.slotselection;

import app.chalo.uistate.dialog.DateAvailabilityStatus;
import defpackage.sr;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/DateAndSlotSelectedForBulkBooking;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class DateAndSlotSelectedForBulkBooking {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7795a;
    public final LocalDateTime b;
    public final DateAvailabilityStatus c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/DateAndSlotSelectedForBulkBooking$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ui/slotselection/DateAndSlotSelectedForBulkBooking;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<DateAndSlotSelectedForBulkBooking> serializer() {
            return DateAndSlotSelectedForBulkBooking$$serializer.f7796a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new sr(26)), LazyKt.a(lazyThreadSafetyMode, new sr(27))};
    }

    public /* synthetic */ DateAndSlotSelectedForBulkBooking(int i, String str, LocalDateTime localDateTime, DateAvailabilityStatus dateAvailabilityStatus, List list) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(DateAndSlotSelectedForBulkBooking$$serializer.f7796a.getDescriptor(), i, 15);
            throw null;
        }
        this.f7795a = str;
        this.b = localDateTime;
        this.c = dateAvailabilityStatus;
        this.d = list;
    }

    public static DateAndSlotSelectedForBulkBooking a(DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking, List slots) {
        String id = dateAndSlotSelectedForBulkBooking.f7795a;
        LocalDateTime date = dateAndSlotSelectedForBulkBooking.b;
        DateAvailabilityStatus remark = dateAndSlotSelectedForBulkBooking.c;
        dateAndSlotSelectedForBulkBooking.getClass();
        Intrinsics.i(id, "id");
        Intrinsics.i(date, "date");
        Intrinsics.i(remark, "remark");
        Intrinsics.i(slots, "slots");
        return new DateAndSlotSelectedForBulkBooking(id, date, remark, slots);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateAndSlotSelectedForBulkBooking)) {
            return false;
        }
        DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking = (DateAndSlotSelectedForBulkBooking) obj;
        return Intrinsics.d(this.f7795a, dateAndSlotSelectedForBulkBooking.f7795a) && Intrinsics.d(this.b, dateAndSlotSelectedForBulkBooking.b) && this.c == dateAndSlotSelectedForBulkBooking.c && Intrinsics.d(this.d, dateAndSlotSelectedForBulkBooking.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f7795a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DateAndSlotSelectedForBulkBooking(id=" + this.f7795a + ", date=" + this.b + ", remark=" + this.c + ", slots=" + this.d + ")";
    }

    public DateAndSlotSelectedForBulkBooking(String id, LocalDateTime date, DateAvailabilityStatus remark, List slots) {
        Intrinsics.i(id, "id");
        Intrinsics.i(date, "date");
        Intrinsics.i(remark, "remark");
        Intrinsics.i(slots, "slots");
        this.f7795a = id;
        this.b = date;
        this.c = remark;
        this.d = slots;
    }
}
