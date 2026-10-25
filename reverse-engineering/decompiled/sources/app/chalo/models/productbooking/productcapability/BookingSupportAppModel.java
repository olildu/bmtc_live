package app.chalo.models.productbooking.productcapability;

import defpackage.cb0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/models/productbooking/productcapability/BookingSupportAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BookingSupportAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5669a;

    public BookingSupportAppModel(boolean z) {
        this.f5669a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BookingSupportAppModel) && this.f5669a == ((BookingSupportAppModel) obj).f5669a;
    }

    public final int hashCode() {
        return this.f5669a ? 1231 : 1237;
    }

    public final String toString() {
        return cb0.k("BookingSupportAppModel(isCancellationAvailable=", ")", this.f5669a);
    }
}
