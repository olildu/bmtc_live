package app.chalo.core.database.dao;

import app.chalo.core.Premium_reserve_ticket_ack_tableQueries;
import app.chalo.core.Premium_reserve_ticket_table;
import app.chalo.core.Premium_reserve_ticket_tableQueries;
import app.chalo.core.database.mappers.PremiumBusMappers;
import app.chalo.premiumbus.data.models.app.FirstBookingAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketBookingProperties;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import defpackage.yw0;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.PremiumBusDaoImpl$clearExistingDataAndInsertPremiumReserveTickets$2", f = "PremiumBusDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusDaoImpl$clearExistingDataAndInsertPremiumReserveTickets$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ List<PremiumReserveTicketEntity> $ticketsList;
    int label;
    final /* synthetic */ PremiumBusDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusDaoImpl$clearExistingDataAndInsertPremiumReserveTickets$2(PremiumBusDaoImpl premiumBusDaoImpl, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = premiumBusDaoImpl;
        this.$ticketsList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PremiumBusDaoImpl$clearExistingDataAndInsertPremiumReserveTickets$2(this.this$0, this.$ticketsList, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        PremiumBusDaoImpl$clearExistingDataAndInsertPremiumReserveTickets$2 premiumBusDaoImpl$clearExistingDataAndInsertPremiumReserveTickets$2 = (PremiumBusDaoImpl$clearExistingDataAndInsertPremiumReserveTickets$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        premiumBusDaoImpl$clearExistingDataAndInsertPremiumReserveTickets$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        final PremiumBusDaoImpl premiumBusDaoImpl = this.this$0;
        Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries = premiumBusDaoImpl.f2069a;
        final List<PremiumReserveTicketEntity> list = this.$ticketsList;
        premium_reserve_ticket_tableQueries.V(new Function1() { // from class: app.chalo.core.database.dao.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                FirstBookingAppModel firstBookingAppModel;
                PremiumBusDaoImpl premiumBusDaoImpl2 = premiumBusDaoImpl;
                Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries2 = premiumBusDaoImpl2.f2069a;
                premium_reserve_ticket_tableQueries2.f697a.A0(-1403593761, "DELETE FROM premium_reserve_ticket_table", null);
                premium_reserve_ticket_tableQueries2.T(-1403593761, new yw0(2));
                for (PremiumReserveTicketEntity premiumReserveTicketEntity : list) {
                    Premium_reserve_ticket_ack_tableQueries premium_reserve_ticket_ack_tableQueries = premiumBusDaoImpl2.c;
                    Premium_reserve_ticket_tableQueries premium_reserve_ticket_tableQueries3 = premiumBusDaoImpl2.f2069a;
                    Premium_reserve_ticket_table premium_reserve_ticket_tableE = PremiumBusMappers.e(premiumReserveTicketEntity);
                    PremiumReserveTicketBookingProperties premiumReserveTicketBookingProperties = premiumReserveTicketEntity.f7136a;
                    premium_reserve_ticket_tableQueries3.h0(premium_reserve_ticket_tableE);
                    PremiumReserveTicketStatus premiumReserveTicketStatus = premiumReserveTicketBookingProperties.h;
                    String str = premiumReserveTicketBookingProperties.f7135a;
                    String str2 = premiumReserveTicketBookingProperties.g;
                    if (premiumReserveTicketStatus == PremiumReserveTicketStatus.SYSTEM_CANCELLED) {
                        PremiumReserveTicketAckEntity premiumReserveTicketAckEntity = (PremiumReserveTicketAckEntity) premium_reserve_ticket_tableQueries3.X(str2, str, new PremiumBusDaoImpl$insertPremiumReserveTicketAndUpdateAckIfNeeded$currentEntry$1(7, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toEntity", "toEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketAckType;ZLjava/lang/String;)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketAckEntity;", 0)).d();
                        if (premiumReserveTicketAckEntity == null) {
                            PremiumReserveTicketAckType ackType = PremiumReserveTicketAckType.SYSTEM_CANCELLED;
                            Intrinsics.i(ackType, "ackType");
                            premium_reserve_ticket_ack_tableQueries.W(PremiumBusMappers.d(new PremiumReserveTicketAckEntity(premiumReserveTicketBookingProperties.f7135a, premiumReserveTicketBookingProperties.d, premiumReserveTicketBookingProperties.e, premiumReserveTicketBookingProperties.g, ackType, false, premiumReserveTicketBookingProperties.k)));
                        } else if (premiumReserveTicketAckEntity.e == PremiumReserveTicketAckType.SYSTEM_RESCHEDULED) {
                            premium_reserve_ticket_ack_tableQueries.X(false, PremiumReserveTicketAckType.SYSTEM_CANCELLED, str, str2);
                        }
                    } else if (premiumReserveTicketBookingProperties.m == PremiumReserveTicketStatus.SYSTEM_RESCHEDULED && (firstBookingAppModel = premiumReserveTicketBookingProperties.l) != null && !StringsKt.F(firstBookingAppModel.f7082a) && firstBookingAppModel.c != -1) {
                        PremiumReserveTicketAckType ackType2 = PremiumReserveTicketAckType.SYSTEM_RESCHEDULED;
                        Intrinsics.i(ackType2, "ackType");
                        premium_reserve_ticket_ack_tableQueries.W(PremiumBusMappers.d(new PremiumReserveTicketAckEntity(premiumReserveTicketBookingProperties.f7135a, premiumReserveTicketBookingProperties.d, premiumReserveTicketBookingProperties.e, premiumReserveTicketBookingProperties.g, ackType2, false, premiumReserveTicketBookingProperties.k)));
                    }
                }
                return Unit.f17538a;
            }
        });
        return Unit.f17538a;
    }
}
