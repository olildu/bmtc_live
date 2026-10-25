package app.chalo.core.database.mappers;

import app.chalo.core.Metro_ticket_table;
import app.chalo.metro.dao.MetroTicketEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MetroTicketEntityMapperKt {
    public static final Metro_ticket_table a(MetroTicketEntity metroTicketEntity) {
        Intrinsics.i(metroTicketEntity, "<this>");
        return new Metro_ticket_table(metroTicketEntity.f5400a, metroTicketEntity.b, metroTicketEntity.c, metroTicketEntity.d, metroTicketEntity.e, metroTicketEntity.f, metroTicketEntity.g, metroTicketEntity.h, metroTicketEntity.i, metroTicketEntity.j, metroTicketEntity.k, metroTicketEntity.l, metroTicketEntity.m, metroTicketEntity.n, metroTicketEntity.o, metroTicketEntity.p);
    }
}
