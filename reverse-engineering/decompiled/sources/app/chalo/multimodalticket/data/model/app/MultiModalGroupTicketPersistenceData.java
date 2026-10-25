package app.chalo.multimodalticket.data.model.app;

import app.chalo.multimodalticket.data.model.MultiModalGroupTicketEntity;
import defpackage.xs;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/model/app/MultiModalGroupTicketPersistenceData;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiModalGroupTicketPersistenceData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiModalGroupTicketEntity f5878a;
    public final ArrayList b;
    public final ArrayList c;

    public MultiModalGroupTicketPersistenceData(MultiModalGroupTicketEntity multiModalGroupTicketEntity, ArrayList arrayList, ArrayList arrayList2) {
        this.f5878a = multiModalGroupTicketEntity;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiModalGroupTicketPersistenceData)) {
            return false;
        }
        MultiModalGroupTicketPersistenceData multiModalGroupTicketPersistenceData = (MultiModalGroupTicketPersistenceData) obj;
        return this.f5878a.equals(multiModalGroupTicketPersistenceData.f5878a) && this.b.equals(multiModalGroupTicketPersistenceData.b) && this.c.equals(multiModalGroupTicketPersistenceData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xs.e(this.b, this.f5878a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MultiModalGroupTicketPersistenceData(group=" + this.f5878a + ", instantTickets=" + this.b + ", ondcMetroTickets=" + this.c + ")";
    }
}
