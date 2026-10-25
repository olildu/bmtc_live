package app.chalo.models.bookinghelp;

import defpackage.a9;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/bookinghelp/BookingHelpFaq;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class BookingHelpFaq {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;
    public static final List h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5606a;
    public final String b;
    public final BookingHelpFaqActionType c;
    public final int d;
    public final BookingHelpFaqGroupType e;
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/bookinghelp/BookingHelpFaq$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/bookinghelp/BookingHelpFaq;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BookingHelpFaq> serializer() {
            return BookingHelpFaq$$serializer.f5607a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new a9(24)), null, LazyKt.a(lazyThreadSafetyMode, new a9(25)), null};
        h = CollectionsKt.R(new BookingHelpFaq("How to cancel my booking?", "You can cancel your booking by going to the 'My Bookings' section in the app.", BookingHelpFaqActionType.CANCEL_BOOKING, 0, BookingHelpFaqGroupType.Generic, false));
    }

    public /* synthetic */ BookingHelpFaq(int i, String str, String str2, BookingHelpFaqActionType bookingHelpFaqActionType, int i2, BookingHelpFaqGroupType bookingHelpFaqGroupType, boolean z) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(BookingHelpFaq$$serializer.f5607a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5606a = str;
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

    public BookingHelpFaq(String question, String answer, BookingHelpFaqActionType actionType, int i, BookingHelpFaqGroupType groupType, boolean z) {
        Intrinsics.i(question, "question");
        Intrinsics.i(answer, "answer");
        Intrinsics.i(actionType, "actionType");
        Intrinsics.i(groupType, "groupType");
        this.f5606a = question;
        this.b = answer;
        this.c = actionType;
        this.d = i;
        this.e = groupType;
        this.f = z;
    }
}
