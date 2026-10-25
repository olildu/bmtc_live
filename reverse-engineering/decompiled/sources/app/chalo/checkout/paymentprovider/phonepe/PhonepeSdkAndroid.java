package app.chalo.checkout.paymentprovider.phonepe;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.Environment;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.domain.phonepe.CreatePhonePePaymentModeDataUseCase;
import app.chalo.checkout.utility.InstalledUpiAppsHelper;
import app.chalo.checkout.utility.InstalledUpiAppsHelperAndroid;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.usecase.GetDistinctIdUseCase;
import app.chalo.utils.KUUID;
import com.phonepe.intent.sdk.api.PhonePeInitException;
import com.phonepe.intent.sdk.api.PhonePeKt;
import com.phonepe.intent.sdk.api.models.PhonePeEnvironment;
import com.phonepe.intent.sdk.api.models.transaction.TransactionRequest;
import com.phonepe.intent.sdk.api.models.transaction.paymentMode.NetBankingPaymentMode;
import com.phonepe.intent.sdk.api.models.transaction.paymentMode.NewCardPaymentMode;
import com.phonepe.intent.sdk.api.models.transaction.paymentMode.PaymentMode;
import com.phonepe.intent.sdk.api.models.transaction.paymentMode.UpiIntentPaymentMode;
import defpackage.tr0;
import defpackage.ur0;
import defpackage.vo1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/checkout/paymentprovider/phonepe/PhonepeSdkAndroid;", "Lapp/chalo/checkout/paymentprovider/phonepe/PhonepeSdk;", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhonepeSdkAndroid implements PhonepeSdk {
    public static final String j = "phonepe-sdk-attempt-".concat(KUUID.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentActivity f1423a;
    public final CrashlyticsLogger b;
    public final ChaloBuildConfig c;
    public final InstalledUpiAppsHelper d;
    public final GetDistinctIdUseCase e;
    public final CreatePhonePePaymentModeDataUseCase f;
    public final PhonepeSdkManager g;
    public final CoroutineContextProvider h;
    public final LinkedHashMap i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/checkout/paymentprovider/phonepe/PhonepeSdkAndroid$Companion;", "", "", "PHONEPE_TAG", "Ljava/lang/String;", "ACTIVITY_RESULT_KEY_PREFIX", "processActivityResultKeyPrefix", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PhonepeSdkAndroid(ComponentActivity componentActivity, CrashlyticsLogger crashlyticsLogger, ChaloBuildConfig chaloBuildConfig, InstalledUpiAppsHelperAndroid installedUpiAppsHelper, GetDistinctIdUseCase getDistinctIdUseCase, CreatePhonePePaymentModeDataUseCase createPhonePePaymentModeDataUseCase, PhonepeSdkManager phonepeSdkManager, CoroutineContextProvider coroutineContextProvider) {
        Intrinsics.i(installedUpiAppsHelper, "installedUpiAppsHelper");
        Intrinsics.i(phonepeSdkManager, "phonepeSdkManager");
        this.f1423a = componentActivity;
        this.b = crashlyticsLogger;
        this.c = chaloBuildConfig;
        this.d = installedUpiAppsHelper;
        this.e = getDistinctIdUseCase;
        this.f = createPhonePePaymentModeDataUseCase;
        this.g = phonepeSdkManager;
        this.h = coroutineContextProvider;
        this.i = new LinkedHashMap();
    }

    @Override // app.chalo.checkout.paymentprovider.phonepe.PhonepeSdk
    public final PhonePeStartTransactionResult a(PhonePeAppTransactionRequestModel phonePeAppTransactionRequestModel, tr0 tr0Var) {
        Long lValueOf;
        PhonepeSdkManager phonepeSdkManager = this.g;
        phonepeSdkManager.getClass();
        if (phonepeSdkManager.c != null) {
            lValueOf = null;
        } else {
            phonepeSdkManager.d = false;
            long j2 = phonepeSdkManager.e;
            phonepeSdkManager.e = 1 + j2;
            phonepeSdkManager.c = Long.valueOf(j2);
            phonepeSdkManager.b = tr0Var;
            lValueOf = Long.valueOf(j2);
        }
        if (lValueOf == null) {
            return PhonePeStartTransactionResult.TRANSACTION_IN_PROGRESS;
        }
        long jLongValue = lValueOf.longValue();
        try {
            if (!h(phonePeAppTransactionRequestModel.f1417a)) {
                f(jLongValue);
                return PhonePeStartTransactionResult.SDK_NOT_READY;
            }
            TransactionRequest transactionRequestG = g(phonePeAppTransactionRequestModel);
            if (transactionRequestG == null) {
                f(jLongValue);
                return PhonePeStartTransactionResult.INVALID_REQUEST;
            }
            PhonePeKt.d(this.f1423a, transactionRequestG, e(jLongValue));
            return PhonePeStartTransactionResult.STARTED;
        } catch (PhonePeInitException e) {
            vo1.x("phonepe exp: ", e.getMessage(), "message");
            f(jLongValue);
            this.b.i(e);
            return PhonePeStartTransactionResult.SDK_INIT_ERROR;
        } catch (Exception e2) {
            vo1.x("exp: ", e2.getMessage(), "message");
            f(jLongValue);
            this.b.i(e2);
            return PhonePeStartTransactionResult.SDK_ERROR;
        }
    }

    @Override // app.chalo.checkout.paymentprovider.phonepe.PhonepeSdk
    public final boolean b(tr0 tr0Var) {
        Object inProgress;
        PendingPhonePeTransactionRecovery.Returned returned = PendingPhonePeTransactionRecovery.Returned.f1416a;
        PhonepeSdkManager phonepeSdkManager = this.g;
        phonepeSdkManager.getClass();
        if (phonepeSdkManager.d) {
            phonepeSdkManager.d = false;
            tr0Var.invoke();
            inProgress = returned;
        } else {
            Long l = phonepeSdkManager.c;
            if (l != null) {
                long jLongValue = l.longValue();
                phonepeSdkManager.b = tr0Var;
                inProgress = new PendingPhonePeTransactionRecovery.InProgress(jLongValue);
            } else {
                inProgress = null;
            }
        }
        if (inProgress instanceof PendingPhonePeTransactionRecovery.InProgress) {
            e(((PendingPhonePeTransactionRecovery.InProgress) inProgress).f1415a);
            return true;
        }
        if (Intrinsics.d(inProgress, returned)) {
            return true;
        }
        if (inProgress == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // app.chalo.checkout.paymentprovider.phonepe.PhonepeSdk
    public final void c() {
        PhonepeSdkManager phonepeSdkManager = this.g;
        Long l = phonepeSdkManager.c;
        phonepeSdkManager.c = null;
        phonepeSdkManager.d = false;
        phonepeSdkManager.b = null;
        if (l != null) {
            ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.i.remove(Long.valueOf(l.longValue()));
            if (activityResultLauncher != null) {
                activityResultLauncher.unregister();
            }
        }
    }

    @Override // app.chalo.checkout.paymentprovider.phonepe.PhonepeSdk
    public final Object d(String str, Continuation continuation) {
        return BuildersKt.g(this.h.b(), new PhonepeSdkAndroid$getUpiApps$2(this, str, null), continuation);
    }

    public final ActivityResultLauncher e(long j2) {
        Long lValueOf = Long.valueOf(j2);
        LinkedHashMap linkedHashMap = this.i;
        Object objRegister = linkedHashMap.get(lValueOf);
        if (objRegister == null) {
            objRegister = this.f1423a.getActivityResultRegistry().register(j + "-" + j2, new ActivityResultContracts.StartActivityForResult(), new ur0(this, j2));
            linkedHashMap.put(lValueOf, objRegister);
        }
        return (ActivityResultLauncher) objRegister;
    }

    public final void f(long j2) {
        PhonepeSdkManager phonepeSdkManager = this.g;
        Long l = phonepeSdkManager.c;
        if (l != null && l.longValue() == j2) {
            phonepeSdkManager.c = null;
            phonepeSdkManager.d = false;
            phonepeSdkManager.b = null;
        }
        ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.i.remove(Long.valueOf(j2));
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    public final TransactionRequest g(PhonePeAppTransactionRequestModel phonePeAppTransactionRequestModel) {
        PhonePePaymentModeData upiIntent;
        PaymentMode upiIntentPaymentMode;
        SelectedPaymentInstrumentData data = phonePeAppTransactionRequestModel.d;
        String strA = this.e.a(false);
        if (strA == null) {
            strA = "";
        }
        String str = strA;
        Intrinsics.i(data, "data");
        if (data instanceof SelectedPaymentInstrumentData.CardData) {
            SelectedPaymentInstrumentData.CardData cardData = (SelectedPaymentInstrumentData.CardData) data;
            List listU = StringsKt.U(cardData.d, new String[]{"/"}, 6);
            if (listU.size() != 2) {
                upiIntent = null;
            } else {
                String str2 = (String) listU.get(0);
                String str3 = (String) listU.get(1);
                if (StringsKt.F(str2) || StringsKt.F(str3)) {
                    upiIntent = null;
                } else {
                    upiIntent = new PhonePePaymentModeData.Card(cardData.c, cardData.e, cardData.b, str2, StringsKt.j0(2, String.valueOf(this.f.f1393a.E())).concat(str3), str);
                }
            }
        } else if (data instanceof SelectedPaymentInstrumentData.NetBankingData) {
            upiIntent = new PhonePePaymentModeData.NetBanking(((SelectedPaymentInstrumentData.NetBankingData) data).b);
        } else if (data instanceof SelectedPaymentInstrumentData.UpiData.IntentFlow) {
            upiIntent = new PhonePePaymentModeData.UpiIntent(((SelectedPaymentInstrumentData.UpiData.IntentFlow) data).c);
        } else {
            if (!(data instanceof SelectedPaymentInstrumentData.WalletData)) {
                throw new NoWhenBranchMatchedException();
            }
            upiIntent = null;
        }
        if (upiIntent == null) {
            return null;
        }
        String str4 = phonePeAppTransactionRequestModel.b;
        String str5 = phonePeAppTransactionRequestModel.c;
        if (upiIntent instanceof PhonePePaymentModeData.Card) {
            PhonePePaymentModeData.Card card = (PhonePePaymentModeData.Card) upiIntent;
            upiIntentPaymentMode = new NewCardPaymentMode(card.f1418a, card.b, card.c, card.d, card.e, card.f, null, null);
        } else if (upiIntent instanceof PhonePePaymentModeData.NetBanking) {
            upiIntentPaymentMode = new NetBankingPaymentMode(((PhonePePaymentModeData.NetBanking) upiIntent).f1419a);
        } else {
            if (!(upiIntent instanceof PhonePePaymentModeData.UpiIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            upiIntentPaymentMode = new UpiIntentPaymentMode(((PhonePePaymentModeData.UpiIntent) upiIntent).f1420a);
        }
        return new TransactionRequest(str4, str5, upiIntentPaymentMode);
    }

    public final boolean h(String merchantId) {
        boolean z;
        PhonePeSdkInitializer phonePeSdkInitializer = PhonePeSdkInitializer.f1421a;
        Environment environment = this.c.getF2153a();
        String strA = this.e.a(false);
        if (strA == null) {
            strA = "";
        }
        ComponentActivity componentActivity = this.f1423a;
        synchronized (phonePeSdkInitializer) {
            Intrinsics.i(environment, "environment");
            Intrinsics.i(merchantId, "merchantId");
            if (merchantId.equals(PhonePeSdkInitializer.b)) {
                z = true;
            } else {
                PhonePeSdkInitializer.b = null;
                Context applicationContext = componentActivity.getApplicationContext();
                Intrinsics.h(applicationContext, "getApplicationContext(...)");
                boolean zC = PhonePeKt.c(applicationContext, merchantId, strA, environment == Environment.PRODUCTION ? PhonePeEnvironment.RELEASE : PhonePeEnvironment.SANDBOX);
                if (zC) {
                    PhonePeSdkInitializer.b = merchantId;
                }
                z = zC;
            }
        }
        String message = "ensureInitialized=" + z;
        Intrinsics.i(message, "message");
        return z;
    }
}
