package app.chalo.ridehailing.data.app;

import defpackage.gf;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideHailingBookingFeedbackResponseAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideHailingBookingFeedbackResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9110a;

    public RideHailingBookingFeedbackResponseAppModel(ArrayList arrayList) {
        this.f9110a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RideHailingBookingFeedbackResponseAppModel) && this.f9110a.equals(((RideHailingBookingFeedbackResponseAppModel) obj).f9110a);
    }

    public final int hashCode() {
        return this.f9110a.hashCode();
    }

    public final String toString() {
        return gf.i("RideHailingBookingFeedbackResponseAppModel(results=", ")", this.f9110a);
    }
}
