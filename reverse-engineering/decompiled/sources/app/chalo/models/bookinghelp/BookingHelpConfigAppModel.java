package app.chalo.models.bookinghelp;

import defpackage.nf1;
import in.juspay.hypersdk.analytics.LogConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/models/bookinghelp/BookingHelpConfigAppModel;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingHelpConfigAppModel {
    public static final BookingHelpConfigAppModel c = new BookingHelpConfigAppModel(LogConstants.DEFAULT_CHANNEL, EmptyList.f17557a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5605a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/models/bookinghelp/BookingHelpConfigAppModel$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public BookingHelpConfigAppModel(String city, List faqs) {
        Intrinsics.i(city, "city");
        Intrinsics.i(faqs, "faqs");
        this.f5605a = city;
        this.b = faqs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingHelpConfigAppModel)) {
            return false;
        }
        BookingHelpConfigAppModel bookingHelpConfigAppModel = (BookingHelpConfigAppModel) obj;
        return Intrinsics.d(this.f5605a, bookingHelpConfigAppModel.f5605a) && Intrinsics.d(this.b, bookingHelpConfigAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5605a.hashCode() * 31);
    }

    public final String toString() {
        return nf1.m("BookingHelpConfigAppModel(city=", this.f5605a, ", faqs=", ")", this.b);
    }
}
