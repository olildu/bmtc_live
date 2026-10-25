package app.chalo.core.database.mappers;

import app.chalo.core.Ondc_metro_ticket_table;
import app.chalo.metro.dao.ondc.OndcMetroTicketEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OndcMetroTicketEntityMapperKt {
    public static final Ondc_metro_ticket_table a(OndcMetroTicketEntity ondcMetroTicketEntity) {
        Intrinsics.i(ondcMetroTicketEntity, "<this>");
        return new Ondc_metro_ticket_table(ondcMetroTicketEntity.f5403a, ondcMetroTicketEntity.b, ondcMetroTicketEntity.c, ondcMetroTicketEntity.d, ondcMetroTicketEntity.e, ondcMetroTicketEntity.f, ondcMetroTicketEntity.g, ondcMetroTicketEntity.h, ondcMetroTicketEntity.i, ondcMetroTicketEntity.j, ondcMetroTicketEntity.k, ondcMetroTicketEntity.l, ondcMetroTicketEntity.m, ondcMetroTicketEntity.n, ondcMetroTicketEntity.o, ondcMetroTicketEntity.p, ondcMetroTicketEntity.q, ondcMetroTicketEntity.r, ondcMetroTicketEntity.s, ondcMetroTicketEntity.t);
    }
}
