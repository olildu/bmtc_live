package app.chalo.juspay;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/CreateJusPaySDKRequestJsonUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateJusPaySDKRequestJsonUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuspaySignatureRepository f3980a;
    public final CityProvider b;
    public final AnalyticsContract c;
    public final ChaloJson d = ChaloJson.f6455a;

    public CreateJusPaySDKRequestJsonUseCase(JuspaySignatureRepository juspaySignatureRepository, CityProvider cityProvider, AnalyticsContract analyticsContract) {
        this.f3980a = juspaySignatureRepository;
        this.b = cityProvider;
        this.c = analyticsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(JusPaySDKRequestAppModel jusPaySDKRequestAppModel, String str, ContinuationImpl continuationImpl) {
        CreateJusPaySDKRequestJsonUseCase$invoke$1 createJusPaySDKRequestJsonUseCase$invoke$1;
        Exception exc;
        String lowerCase;
        JusPaySignatureRequestApiModel upiUiScanPay;
        ChaloJson chaloJson = this.d;
        if (continuationImpl instanceof CreateJusPaySDKRequestJsonUseCase$invoke$1) {
            createJusPaySDKRequestJsonUseCase$invoke$1 = (CreateJusPaySDKRequestJsonUseCase$invoke$1) continuationImpl;
            int i = createJusPaySDKRequestJsonUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createJusPaySDKRequestJsonUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                createJusPaySDKRequestJsonUseCase$invoke$1 = new CreateJusPaySDKRequestJsonUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            createJusPaySDKRequestJsonUseCase$invoke$1 = new CreateJusPaySDKRequestJsonUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = createJusPaySDKRequestJsonUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = createJusPaySDKRequestJsonUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                String strB = CityProviderKt.b(this.b);
                if (strB != null) {
                    lowerCase = strB.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = "";
                }
                if (jusPaySDKRequestAppModel instanceof JusPaySDKRequestAppModel.OnBoardingAndPay) {
                    upiUiScanPay = new JusPaySignatureRequestApiModel.OnboardingAndPay(((JusPaySDKRequestAppModel.OnBoardingAndPay) jusPaySDKRequestAppModel).b, ((JusPaySDKRequestAppModel.OnBoardingAndPay) jusPaySDKRequestAppModel).d, lowerCase);
                } else if (Intrinsics.d(jusPaySDKRequestAppModel, JusPaySDKRequestAppModel.GetUpiSessionToken.b)) {
                    upiUiScanPay = new JusPaySignatureRequestApiModel.GetUpiSessionToken(lowerCase);
                } else if (jusPaySDKRequestAppModel instanceof JusPaySDKRequestAppModel.InitiateSDK) {
                    upiUiScanPay = new JusPaySignatureRequestApiModel.InitiateSDK(lowerCase);
                } else if (Intrinsics.d(jusPaySDKRequestAppModel, JusPaySDKRequestAppModel.UpdateSessionToken.b)) {
                    upiUiScanPay = new JusPaySignatureRequestApiModel.UpdateSessionToken(lowerCase);
                } else if (Intrinsics.d(jusPaySDKRequestAppModel, JusPaySDKRequestAppModel.AccountManagement.b)) {
                    upiUiScanPay = new JusPaySignatureRequestApiModel.Management(lowerCase);
                } else {
                    if (!(jusPaySDKRequestAppModel instanceof JusPaySDKRequestAppModel.UpiUiScanPay)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    upiUiScanPay = new JusPaySignatureRequestApiModel.UpiUiScanPay(lowerCase);
                }
                JuspaySignatureRepository juspaySignatureRepository = this.f3980a;
                createJusPaySDKRequestJsonUseCase$invoke$1.L$0 = str;
                createJusPaySDKRequestJsonUseCase$invoke$1.L$1 = jusPaySDKRequestAppModel;
                createJusPaySDKRequestJsonUseCase$invoke$1.label = 1;
                objA = juspaySignatureRepository.a(upiUiScanPay, createJusPaySDKRequestJsonUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jusPaySDKRequestAppModel = (JusPaySDKRequestAppModel) createJusPaySDKRequestJsonUseCase$invoke$1.L$1;
                str = (String) createJusPaySDKRequestJsonUseCase$invoke$1.L$0;
                ResultKt.b(objA);
            }
            JusPaySDKRequestAppModel jusPaySDKRequestAppModel2 = jusPaySDKRequestAppModel;
            try {
                JusPaySignaturesAppModel jusPaySignaturesAppModel = (JusPaySignaturesAppModel) objA;
                JusPaySDKRequestApiModel jusPaySDKRequestApiModelA = JusPayRequestAppToApiModelKt.a(jusPaySDKRequestAppModel2, str, jusPaySignaturesAppModel.b, jusPaySignaturesAppModel.f4026a, jusPaySignaturesAppModel.d, jusPaySignaturesAppModel.c);
                try {
                    chaloJson.getClass();
                    Json json = ChaloJson.b;
                    json.getClass();
                    return new ChaloUseCaseResult.Success(JsonElementKt.g(json.f(json.a(JusPaySDKRequestApiModel.INSTANCE.serializer(), jusPaySDKRequestApiModelA))));
                } catch (Exception e) {
                    exc = e;
                    jusPaySDKRequestAppModel = jusPaySDKRequestAppModel2;
                    AnalyticsContract.DefaultImpls.a(this.c, "juspay request creation failed", "USECASE", MapsKt.i(new Pair("reason", String.valueOf(exc.getMessage())), new Pair("request", jusPaySDKRequestAppModel.toString())), null, false, 24);
                    if (exc instanceof ChaloLocalException) {
                        String message = exc.getMessage();
                        return new ChaloUseCaseResult.Failure(new JuspaySdkRequestError.Local(message != null ? message : "Something went wrong"));
                    }
                    if (exc instanceof JuspaySignatureRemoteException) {
                        String message2 = exc.getMessage();
                        JuspaySignatureRemoteException juspaySignatureRemoteException = (JuspaySignatureRemoteException) exc;
                        GenericChaloErrorResponse errorResponse = juspaySignatureRemoteException.getErrorResponse();
                        String strC = dd.c(errorResponse != null ? new Integer(errorResponse.f6497a) : null, message2, " code: ");
                        GenericChaloErrorResponse errorResponse2 = juspaySignatureRemoteException.getErrorResponse();
                        return new ChaloUseCaseResult.Failure(new JuspaySdkRequestError.Api(strC, errorResponse2 != null ? new Integer(errorResponse2.f6497a) : null));
                    }
                    if (exc instanceof NetworkSuccessResponseParseException) {
                        return new ChaloUseCaseResult.Failure(JuspaySdkRequestError.ResponseParsing.b);
                    }
                    if (!(exc instanceof JusPaySignatureInvalidDataException)) {
                        return new ChaloUseCaseResult.Failure(new JuspaySdkRequestError.Unknown("Something went wrong", 0));
                    }
                    String message3 = exc.getMessage();
                    return new ChaloUseCaseResult.Failure(new JuspaySdkRequestError.InvalidData(message3 != null ? message3 : "Something went wrong"));
                }
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }
}
