package app.chalo.core.database.mappers;

import app.chalo.core.Ondc_ticket_table;
import app.chalo.ondc.dao.OndcTicketEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OndcTicketEntityMapperKt {
    public static final Ondc_ticket_table a(OndcTicketEntity ondcTicketEntity) {
        Intrinsics.i(ondcTicketEntity, "<this>");
        return new Ondc_ticket_table(ondcTicketEntity.f6697a, ondcTicketEntity.b, ondcTicketEntity.c, ondcTicketEntity.d, ondcTicketEntity.e, ondcTicketEntity.f, ondcTicketEntity.g, ondcTicketEntity.h, ondcTicketEntity.i, ondcTicketEntity.j, ondcTicketEntity.k, ondcTicketEntity.l, ondcTicketEntity.m, ondcTicketEntity.n, ondcTicketEntity.o, ondcTicketEntity.p, ondcTicketEntity.q, ondcTicketEntity.r);
    }
}
