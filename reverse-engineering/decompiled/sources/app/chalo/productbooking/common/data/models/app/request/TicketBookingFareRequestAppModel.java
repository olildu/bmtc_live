package app.chalo.productbooking.common.data.models.app.request;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.n21;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/request/TicketBookingFareRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketBookingFareRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8231a;
    public final ChaloTransitMode b;
    public final StopAppModel c;
    public final StopAppModel d;
    public final String e;

    public TicketBookingFareRequestAppModel(String str, ChaloTransitMode transitMode, StopAppModel startStop, StopAppModel endStop, String configurationId) {
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(endStop, "endStop");
        Intrinsics.i(configurationId, "configurationId");
        this.f8231a = str;
        this.b = transitMode;
        this.c = startStop;
        this.d = endStop;
        this.e = configurationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketBookingFareRequestAppModel)) {
            return false;
        }
        TicketBookingFareRequestAppModel ticketBookingFareRequestAppModel = (TicketBookingFareRequestAppModel) obj;
        return this.f8231a.equals(ticketBookingFareRequestAppModel.f8231a) && this.b == ticketBookingFareRequestAppModel.b && Intrinsics.d(this.c, ticketBookingFareRequestAppModel.c) && Intrinsics.d(this.d, ticketBookingFareRequestAppModel.d) && Intrinsics.d(this.e, ticketBookingFareRequestAppModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + n21.b(this.d, n21.b(this.c, n21.c(this.b, this.f8231a.hashCode() * 31, 961), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TicketBookingFareRequestAppModel(cityName=");
        sb.append(this.f8231a);
        sb.append(", transitMode=");
        sb.append(this.b);
        sb.append(", routeId=null, startStop=");
        sb.append(this.c);
        sb.append(", endStop=");
        sb.append(this.d);
        sb.append(", configurationId=");
        return vo1.p(sb, this.e, ")");
    }
}
