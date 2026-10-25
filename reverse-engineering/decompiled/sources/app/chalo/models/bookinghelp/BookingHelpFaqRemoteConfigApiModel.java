package app.chalo.models.bookinghelp;

import defpackage.a9;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/bookinghelp/BookingHelpFaqRemoteConfigApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BookingHelpFaqRemoteConfigApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5608a;
    public final String b;
    public final BookingHelpFaqActionType c;
    public final int d;
    public final BookingHelpFaqGroupType e;
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/bookinghelp/BookingHelpFaqRemoteConfigApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/bookinghelp/BookingHelpFaqRemoteConfigApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BookingHelpFaqRemoteConfigApiModel> serializer() {
            return BookingHelpFaqRemoteConfigApiModel$$serializer.f5609a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new a9(26)), null, LazyKt.a(lazyThreadSafetyMode, new a9(27)), null};
    }

    public /* synthetic */ BookingHelpFaqRemoteConfigApiModel(int i, String str, String str2, BookingHelpFaqActionType bookingHelpFaqActionType, int i2, BookingHelpFaqGroupType bookingHelpFaqGroupType, boolean z) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(BookingHelpFaqRemoteConfigApiModel$$serializer.f5609a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5608a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = BookingHelpFaqActionType.NONE;
        } else {
            this.c = bookingHelpFaqActionType;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = BookingHelpFaqGroupType.Generic;
        } else {
            this.e = bookingHelpFaqGroupType;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingHelpFaqRemoteConfigApiModel)) {
            return false;
        }
        BookingHelpFaqRemoteConfigApiModel bookingHelpFaqRemoteConfigApiModel = (BookingHelpFaqRemoteConfigApiModel) obj;
        return Intrinsics.d(this.f5608a, bookingHelpFaqRemoteConfigApiModel.f5608a) && Intrinsics.d(this.b, bookingHelpFaqRemoteConfigApiModel.b) && this.c == bookingHelpFaqRemoteConfigApiModel.c && this.d == bookingHelpFaqRemoteConfigApiModel.d && this.e == bookingHelpFaqRemoteConfigApiModel.e && this.f == bookingHelpFaqRemoteConfigApiModel.f;
    }

    public final int hashCode() {
        return ((this.e.hashCode() + ((((this.c.hashCode() + nf1.e(this.f5608a.hashCode() * 31, 31, this.b)) * 31) + this.d) * 31)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("BookingHelpFaqRemoteConfigApiModel(question=", this.f5608a, ", answer=", this.b, ", actionType=");
        sbE.append(this.c);
        sbE.append(", order=");
        sbE.append(this.d);
        sbE.append(", groupType=");
        sbE.append(this.e);
        sbE.append(", isExpanded=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
