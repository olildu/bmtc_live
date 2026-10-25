package app.chalo.checkout.domain;

import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofile.UserProfileAppModel;
import defpackage.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/CreateInaiPaymentDataUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateInaiPaymentDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f1368a;

    public CreateInaiPaymentDataUseCase(UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f1368a = userProfileDetailsProvider;
    }

    public static LinkedHashMap b(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("name", str);
        linkedHashMap.put("value", str2);
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        CreateInaiPaymentDataUseCase$addContactDetails$1 createInaiPaymentDataUseCase$addContactDetails$1;
        String str;
        CreateInaiPaymentDataUseCase createInaiPaymentDataUseCase;
        List list;
        List list2;
        String str2;
        if (continuationImpl instanceof CreateInaiPaymentDataUseCase$addContactDetails$1) {
            createInaiPaymentDataUseCase$addContactDetails$1 = (CreateInaiPaymentDataUseCase$addContactDetails$1) continuationImpl;
            int i = createInaiPaymentDataUseCase$addContactDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createInaiPaymentDataUseCase$addContactDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                createInaiPaymentDataUseCase$addContactDetails$1 = new CreateInaiPaymentDataUseCase$addContactDetails$1(this, continuationImpl);
            }
        } else {
            createInaiPaymentDataUseCase$addContactDetails$1 = new CreateInaiPaymentDataUseCase$addContactDetails$1(this, continuationImpl);
        }
        Object objL = createInaiPaymentDataUseCase$addContactDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = createInaiPaymentDataUseCase$addContactDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            arrayList.add(b("first_name", "chalo"));
            arrayList.add(b("name", "chalo"));
            createInaiPaymentDataUseCase$addContactDetails$1.L$0 = arrayList;
            str = "contact_number";
            createInaiPaymentDataUseCase$addContactDetails$1.L$1 = "contact_number";
            createInaiPaymentDataUseCase$addContactDetails$1.L$2 = this;
            createInaiPaymentDataUseCase$addContactDetails$1.L$3 = arrayList;
            createInaiPaymentDataUseCase$addContactDetails$1.label = 1;
            objL = this.f1368a.l(createInaiPaymentDataUseCase$addContactDetails$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
            createInaiPaymentDataUseCase = this;
            list = arrayList;
            list2 = arrayList;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list3 = (List) createInaiPaymentDataUseCase$addContactDetails$1.L$3;
            createInaiPaymentDataUseCase = (CreateInaiPaymentDataUseCase) createInaiPaymentDataUseCase$addContactDetails$1.L$2;
            str = (String) createInaiPaymentDataUseCase$addContactDetails$1.L$1;
            List list4 = (List) createInaiPaymentDataUseCase$addContactDetails$1.L$0;
            ResultKt.b(objL);
            list = list4;
            list2 = list3;
        }
        UserProfileAppModel userProfileAppModel = (UserProfileAppModel) objL;
        if (userProfileAppModel == null || (str2 = userProfileAppModel.e) == null) {
            str2 = "";
        }
        createInaiPaymentDataUseCase.getClass();
        list2.add(b(str, str2));
        list.add(b("contact_email", "chalo@gmail.com"));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(SelectedPaymentInstrumentData selectedPaymentInstrumentData, ContinuationImpl continuationImpl) {
        CreateInaiPaymentDataUseCase$invoke$1 createInaiPaymentDataUseCase$invoke$1;
        if (continuationImpl instanceof CreateInaiPaymentDataUseCase$invoke$1) {
            createInaiPaymentDataUseCase$invoke$1 = (CreateInaiPaymentDataUseCase$invoke$1) continuationImpl;
            int i = createInaiPaymentDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createInaiPaymentDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                createInaiPaymentDataUseCase$invoke$1 = new CreateInaiPaymentDataUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            createInaiPaymentDataUseCase$invoke$1 = new CreateInaiPaymentDataUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = createInaiPaymentDataUseCase$invoke$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = createInaiPaymentDataUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map = (Map) createInaiPaymentDataUseCase$invoke$1.L$0;
            ResultKt.b(obj);
            return map;
        }
        LinkedHashMap linkedHashMapO = d.o(obj);
        ArrayList arrayList = new ArrayList();
        if (selectedPaymentInstrumentData != null) {
            if (selectedPaymentInstrumentData instanceof SelectedPaymentInstrumentData.CardData) {
                SelectedPaymentInstrumentData.CardData cardData = (SelectedPaymentInstrumentData.CardData) selectedPaymentInstrumentData;
                arrayList.add(b("cvc", cardData.b));
                arrayList.add(b("number", cardData.c));
                arrayList.add(b("expiry", cardData.d));
                arrayList.add(b("holder_name", cardData.e));
            } else if (selectedPaymentInstrumentData instanceof SelectedPaymentInstrumentData.NetBankingData) {
                arrayList.add(b("bank_code", ((SelectedPaymentInstrumentData.NetBankingData) selectedPaymentInstrumentData).b));
            } else if (selectedPaymentInstrumentData instanceof SelectedPaymentInstrumentData.UpiData) {
                if (!(((SelectedPaymentInstrumentData.UpiData) selectedPaymentInstrumentData) instanceof SelectedPaymentInstrumentData.UpiData.IntentFlow)) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedHashMapO.put("mode", "upi_intent");
                arrayList.add(b("upi_intent", ((SelectedPaymentInstrumentData.UpiData.IntentFlow) selectedPaymentInstrumentData).c));
            } else if (!(selectedPaymentInstrumentData instanceof SelectedPaymentInstrumentData.WalletData)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        linkedHashMapO.put("fields", arrayList);
        createInaiPaymentDataUseCase$invoke$1.L$0 = linkedHashMapO;
        createInaiPaymentDataUseCase$invoke$1.label = 1;
        return a(arrayList, createInaiPaymentDataUseCase$invoke$1) == obj2 ? obj2 : linkedHashMapO;
    }
}
