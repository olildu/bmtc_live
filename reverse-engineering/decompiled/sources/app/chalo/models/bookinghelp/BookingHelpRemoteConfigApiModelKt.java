package app.chalo.models.bookinghelp;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BookingHelpRemoteConfigApiModelKt {
    public static final BookingHelpConfigAppModel a(BookingHelpCityWiseRemoteConfigApiModel bookingHelpCityWiseRemoteConfigApiModel) {
        String str = bookingHelpCityWiseRemoteConfigApiModel.c;
        List<BookingHelpFaqRemoteConfigApiModel> list = bookingHelpCityWiseRemoteConfigApiModel.d;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (BookingHelpFaqRemoteConfigApiModel bookingHelpFaqRemoteConfigApiModel : list) {
            Intrinsics.i(bookingHelpFaqRemoteConfigApiModel, "<this>");
            arrayList.add(new BookingHelpFaq(bookingHelpFaqRemoteConfigApiModel.f5608a, bookingHelpFaqRemoteConfigApiModel.b, bookingHelpFaqRemoteConfigApiModel.c, bookingHelpFaqRemoteConfigApiModel.d, bookingHelpFaqRemoteConfigApiModel.e, bookingHelpFaqRemoteConfigApiModel.f));
        }
        return new BookingHelpConfigAppModel(str, arrayList);
    }
}
