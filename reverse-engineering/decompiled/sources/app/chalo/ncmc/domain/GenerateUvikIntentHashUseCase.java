package app.chalo.ncmc.domain;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.ncmc.data.appmodel.IntentHashAppModel;
import app.chalo.ncmc.data.appmodel.IntentHashRequestAppModel;
import app.chalo.ncmc.data.error.UvikIntentHashCreationException;
import app.chalo.ncmc.data.error.UvikInvalidResponseException;
import app.chalo.ncmc.repository.INcmcCardRepository;
import app.chalo.ncmc.uvik.UvikServiceType;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ncmc/domain/GenerateUvikIntentHashUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GenerateUvikIntentHashUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f6233a;
    public final INcmcCardRepository b;
    public final AnalyticsContract c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/ncmc/domain/GenerateUvikIntentHashUseCase$Companion;", "", "", "SOMETHING_WENT_WRONG", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GenerateUvikIntentHashUseCase(UserProfileDetailsProvider userProfileDetailsProvider, INcmcCardRepository iNcmcCardRepository, AnalyticsContract analyticsContract) {
        this.f6233a = userProfileDetailsProvider;
        this.b = iNcmcCardRepository;
        this.c = analyticsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(UvikServiceType uvikServiceType, ContinuationImpl continuationImpl) {
        GenerateUvikIntentHashUseCase$invoke$1 generateUvikIntentHashUseCase$invoke$1;
        String str;
        if (continuationImpl instanceof GenerateUvikIntentHashUseCase$invoke$1) {
            generateUvikIntentHashUseCase$invoke$1 = (GenerateUvikIntentHashUseCase$invoke$1) continuationImpl;
            int i = generateUvikIntentHashUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateUvikIntentHashUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                generateUvikIntentHashUseCase$invoke$1 = new GenerateUvikIntentHashUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            generateUvikIntentHashUseCase$invoke$1 = new GenerateUvikIntentHashUseCase$invoke$1(this, continuationImpl);
        }
        Object objF = generateUvikIntentHashUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = generateUvikIntentHashUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objF);
                UserProfileAppModel userProfileAppModelF = this.f6233a.f();
                if (userProfileAppModelF != null && (str = userProfileAppModelF.e) != null) {
                    IntentHashRequestAppModel intentHashRequestAppModel = new IntentHashRequestAppModel(str, uvikServiceType);
                    INcmcCardRepository iNcmcCardRepository = this.b;
                    generateUvikIntentHashUseCase$invoke$1.label = 1;
                    objF = iNcmcCardRepository.f(intentHashRequestAppModel, generateUvikIntentHashUseCase$invoke$1);
                    if (objF == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new ChaloUseCaseResult.Failure(UvikIntentHashFailureReason.UserNotLoggedIn.b);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
            return new ChaloUseCaseResult.Success((IntentHashAppModel) objF);
        } catch (Exception e) {
            AnalyticsContractImplKt.b(this.c, "uvik intent hash creation failed", Source.NCMC_TAP_SCREEN, vo1.s("reason", String.valueOf(e.getMessage())), false, 24);
            if (e instanceof UvikIntentHashCreationException) {
                String message = e.getMessage();
                GenericChaloErrorResponse genericChaloErrorResponse = ((UvikIntentHashCreationException) e).getGenericChaloErrorResponse();
                return new ChaloUseCaseResult.Failure(new UvikIntentHashFailureReason.ApiFailure(dd.c(genericChaloErrorResponse != null ? new Integer(genericChaloErrorResponse.f6497a) : null, message, " code: ")));
            }
            if (e instanceof UvikInvalidResponseException) {
                String msg = ((UvikInvalidResponseException) e).getMsg();
                return new ChaloUseCaseResult.Failure(new UvikIntentHashFailureReason.ApiFailure(msg != null ? msg : "Something went wrong"));
            }
            if (e instanceof NetworkSuccessResponseParseException) {
                return new ChaloUseCaseResult.Failure(UvikIntentHashFailureReason.ResponseParseError.b);
            }
            if (e instanceof ChaloLocalException) {
                String message2 = e.getMessage();
                return new ChaloUseCaseResult.Failure(new UvikIntentHashFailureReason.LocalError(message2 != null ? message2 : "Something went wrong"));
            }
            String message3 = e.getMessage();
            return new ChaloUseCaseResult.Failure(new UvikIntentHashFailureReason.ApiFailure(message3 != null ? message3 : "Something went wrong"));
        }
    }
}
