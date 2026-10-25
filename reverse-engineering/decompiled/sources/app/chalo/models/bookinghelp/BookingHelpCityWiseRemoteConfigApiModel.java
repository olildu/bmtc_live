package app.chalo.models.bookinghelp;

import defpackage.a9;
import defpackage.nf1;
import defpackage.uf0;
import java.util.List;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/bookinghelp/BookingHelpCityWiseRemoteConfigApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BookingHelpCityWiseRemoteConfigApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a9(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5603a;
    public final int b;
    public final String c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/bookinghelp/BookingHelpCityWiseRemoteConfigApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/bookinghelp/BookingHelpCityWiseRemoteConfigApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BookingHelpCityWiseRemoteConfigApiModel> serializer() {
            return BookingHelpCityWiseRemoteConfigApiModel$$serializer.f5604a;
        }
    }

    public /* synthetic */ BookingHelpCityWiseRemoteConfigApiModel(int i, int i2, int i3, String str, List list) {
        if (12 != (i & 12)) {
            PluginExceptionsKt.b(BookingHelpCityWiseRemoteConfigApiModel$$serializer.f5604a.getDescriptor(), i, 12);
            throw null;
        }
        this.f5603a = (i & 1) == 0 ? Integer.MIN_VALUE : i2;
        if ((i & 2) == 0) {
            this.b = Integer.MAX_VALUE;
        } else {
            this.b = i3;
        }
        this.c = str;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingHelpCityWiseRemoteConfigApiModel)) {
            return false;
        }
        BookingHelpCityWiseRemoteConfigApiModel bookingHelpCityWiseRemoteConfigApiModel = (BookingHelpCityWiseRemoteConfigApiModel) obj;
        return this.f5603a == bookingHelpCityWiseRemoteConfigApiModel.f5603a && this.b == bookingHelpCityWiseRemoteConfigApiModel.b && Intrinsics.d(this.c, bookingHelpCityWiseRemoteConfigApiModel.c) && Intrinsics.d(this.d, bookingHelpCityWiseRemoteConfigApiModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(((this.f5603a * 31) + this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return uf0.p(this.c, ", faqList=", ")", uf0.s(this.f5603a, this.b, "BookingHelpCityWiseRemoteConfigApiModel(minVer=", ", maxVer=", ", cityName="), this.d);
    }
}
