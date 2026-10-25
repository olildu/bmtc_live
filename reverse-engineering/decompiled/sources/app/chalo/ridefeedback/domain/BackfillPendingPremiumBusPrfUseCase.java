package app.chalo.ridefeedback.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.models.UserBookingsStatusType;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTripAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity;
import app.chalo.utils.chalologger.ChaloLog;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ridefeedback/domain/BackfillPendingPremiumBusPrfUseCase;", "", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BackfillPendingPremiumBusPrfUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f9074a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;
    public final BasicInfoContract d;
    public final RecordPendingFeedbackUseCase e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ridefeedback/domain/BackfillPendingPremiumBusPrfUseCase$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "RETRY_DELAY_MILLIS", "J", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public BackfillPendingPremiumBusPrfUseCase(PremiumBusRepository premiumBusRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider, BasicInfoContract basicInfoContract, RecordPendingFeedbackUseCase recordPendingFeedbackUseCase) {
        this.f9074a = premiumBusRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
        this.d = basicInfoContract;
        this.e = recordPendingFeedbackUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x010c  */
    /* JADX WARN: Code duplicated, block: B:39:0x012a  */
    /* JADX WARN: Code duplicated, block: B:41:0x012e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00fd -> B:27:0x0100). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase r14, java.util.List r15, java.util.List r16, java.lang.String r17, long r18, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase.a(app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase, java.util.List, java.util.List, java.lang.String, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static long d(PremiumReserveTicketAppModel premiumReserveTicketAppModel, PremiumReserveTripAppModel premiumReserveTripAppModel) {
        PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel = premiumReserveTicketAppModel.b;
        long j = premiumReserveTicketTripPropertiesAppModel.d;
        return (j <= 0 && ((premiumReserveTripAppModel != null && premiumReserveTripAppModel.e) || premiumReserveTicketAppModel.f7113a.h == PremiumReserveTicketStatus.EXPIRED)) ? premiumReserveTicketTripPropertiesAppModel.b : j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(PremiumReserveTicketAppModel premiumReserveTicketAppModel, PremiumReserveTripAppModel premiumReserveTripAppModel, long j, ContinuationImpl continuationImpl) {
        BackfillPendingPremiumBusPrfUseCase$backfillTicket$1 backfillPendingPremiumBusPrfUseCase$backfillTicket$1;
        if (continuationImpl instanceof BackfillPendingPremiumBusPrfUseCase$backfillTicket$1) {
            backfillPendingPremiumBusPrfUseCase$backfillTicket$1 = (BackfillPendingPremiumBusPrfUseCase$backfillTicket$1) continuationImpl;
            int i = backfillPendingPremiumBusPrfUseCase$backfillTicket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                backfillPendingPremiumBusPrfUseCase$backfillTicket$1.label = i - Integer.MIN_VALUE;
            } else {
                backfillPendingPremiumBusPrfUseCase$backfillTicket$1 = new BackfillPendingPremiumBusPrfUseCase$backfillTicket$1(this, continuationImpl);
            }
        } else {
            backfillPendingPremiumBusPrfUseCase$backfillTicket$1 = new BackfillPendingPremiumBusPrfUseCase$backfillTicket$1(this, continuationImpl);
        }
        Object objA = backfillPendingPremiumBusPrfUseCase$backfillTicket$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = backfillPendingPremiumBusPrfUseCase$backfillTicket$1.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                if ((premiumReserveTripAppModel != null && premiumReserveTripAppModel.e) || d(premiumReserveTicketAppModel, premiumReserveTripAppModel) <= j) {
                    PostRideFeedbackEntity postRideFeedbackEntityA = PremiumReserveTicketFeedbackMapperKt.a(premiumReserveTicketAppModel, j, d(premiumReserveTicketAppModel, premiumReserveTripAppModel));
                    if (postRideFeedbackEntityA != null) {
                        RecordPendingFeedbackUseCase recordPendingFeedbackUseCase = this.e;
                        backfillPendingPremiumBusPrfUseCase$backfillTicket$1.L$0 = premiumReserveTicketAppModel;
                        backfillPendingPremiumBusPrfUseCase$backfillTicket$1.label = 1;
                        objA = recordPendingFeedbackUseCase.a(postRideFeedbackEntityA, backfillPendingPremiumBusPrfUseCase$backfillTicket$1);
                        if (objA == obj) {
                            return obj;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) backfillPendingPremiumBusPrfUseCase$backfillTicket$1.L$0;
            ResultKt.b(objA);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ChaloLog.c("BackfillPendingPremiumBusPrfUseCase", "Failed to backfill PRF for booking ".concat(premiumReserveTicketAppModel.f7113a.f7114a), e2);
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c(Continuation continuation) {
        String strM;
        String strB;
        UserProfileDetailsProvider userProfileDetailsProvider = this.b;
        if (((Boolean) userProfileDetailsProvider.g().getValue()).booleanValue() && (strM = userProfileDetailsProvider.m()) != null && (strB = CityProviderKt.b(this.c)) != null) {
            String lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            UserBookingsStatusType userBookingsStatusType = UserBookingsStatusType.ALL;
            PremiumBusRepository premiumBusRepository = this.f9074a;
            Object objJ = FlowKt.j(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(PremiumBusRepository.DefaultImpls.a(premiumBusRepository, lowerCase, userBookingsStatusType, 4), premiumBusRepository.F(lowerCase), new BackfillPendingPremiumBusPrfUseCase$invoke$2(3, null)), new BackfillPendingPremiumBusPrfUseCase$invoke$3(this, strM, null), continuation);
            if (objJ == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objJ;
            }
        }
        return Unit.f17538a;
    }
}
