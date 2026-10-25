package app.chalo.wallet.domain;

import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/wallet/domain/GetLoadMoneyDenominationsUseCase;", "", "Companion", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetLoadMoneyDenominationsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f10772a;
    public final GetWalletSetupConfigurationUseCase b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/wallet/domain/GetLoadMoneyDenominationsUseCase$Companion;", "", "", "DEFAULT_NUMBER_OF_DENOMINATIONS", "I", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GetLoadMoneyDenominationsUseCase(WalletRepository walletRepository, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase) {
        this.f10772a = walletRepository;
        this.b = getWalletSetupConfigurationUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1 getLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1;
        if (continuationImpl instanceof GetLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1) {
            getLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1 = (GetLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1) continuationImpl;
            int i = getLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1.label = i - Integer.MIN_VALUE;
            } else {
                getLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1 = new GetLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1(this, continuationImpl);
            }
        } else {
            getLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1 = new GetLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1(this, continuationImpl);
        }
        Object objB = getLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            getLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1.label = 1;
            objB = this.b.b(getLoadMoneyDenominationsUseCase$getDefaultListOfDenominations$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return ((WalletSetupConfiguration) objB).g;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i, long j, ContinuationImpl continuationImpl) {
        GetLoadMoneyDenominationsUseCase$invoke$1 getLoadMoneyDenominationsUseCase$invoke$1;
        int i2;
        Object objE;
        int i3;
        long j2;
        List list;
        List list2;
        ArrayList arrayList;
        int size;
        if (continuationImpl instanceof GetLoadMoneyDenominationsUseCase$invoke$1) {
            getLoadMoneyDenominationsUseCase$invoke$1 = (GetLoadMoneyDenominationsUseCase$invoke$1) continuationImpl;
            int i4 = getLoadMoneyDenominationsUseCase$invoke$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                getLoadMoneyDenominationsUseCase$invoke$1.label = i4 - Integer.MIN_VALUE;
            } else {
                getLoadMoneyDenominationsUseCase$invoke$1 = new GetLoadMoneyDenominationsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getLoadMoneyDenominationsUseCase$invoke$1 = new GetLoadMoneyDenominationsUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = getLoadMoneyDenominationsUseCase$invoke$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = getLoadMoneyDenominationsUseCase$invoke$1.label;
        if (i5 == 0) {
            ResultKt.b(obj);
            i2 = i <= 0 ? 3 : i;
            getLoadMoneyDenominationsUseCase$invoke$1.I$0 = i;
            getLoadMoneyDenominationsUseCase$invoke$1.J$0 = j;
            getLoadMoneyDenominationsUseCase$invoke$1.I$1 = i2;
            getLoadMoneyDenominationsUseCase$invoke$1.label = 1;
            objE = this.f10772a.E(i2, getLoadMoneyDenominationsUseCase$invoke$1);
            if (objE != obj2) {
            }
            return obj2;
        }
        if (i5 == 1) {
            int i6 = getLoadMoneyDenominationsUseCase$invoke$1.I$1;
            j = getLoadMoneyDenominationsUseCase$invoke$1.J$0;
            int i7 = getLoadMoneyDenominationsUseCase$invoke$1.I$0;
            ResultKt.b(obj);
            i2 = i6;
            i = i7;
            objE = obj;
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = getLoadMoneyDenominationsUseCase$invoke$1.J$0;
            i3 = getLoadMoneyDenominationsUseCase$invoke$1.I$0;
            list = (List) getLoadMoneyDenominationsUseCase$invoke$1.L$1;
            list2 = (List) getLoadMoneyDenominationsUseCase$invoke$1.L$0;
            ResultKt.b(obj);
        }
        List listA0 = CollectionsKt.a0((Iterable) obj, CollectionsKt.G0(list2));
        arrayList = new ArrayList();
        for (Object obj3 : listA0) {
            if (((Number) obj3).intValue() >= j2) {
                arrayList.add(obj3);
            }
        }
        size = i3 - list2.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (arrayList.size() > i8) {
                list.add(arrayList.get(i8));
            }
        }
        return CollectionsKt.u0(list);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : (Iterable) objE) {
            if (((Number) obj4).intValue() >= j) {
                arrayList2.add(obj4);
            }
        }
        if (arrayList2.size() == i2) {
            return arrayList2;
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        ArrayList arrayListB0 = CollectionsKt.b0(Arrays.copyOf(numArr, numArr.length));
        getLoadMoneyDenominationsUseCase$invoke$1.L$0 = arrayList2;
        getLoadMoneyDenominationsUseCase$invoke$1.L$1 = arrayListB0;
        getLoadMoneyDenominationsUseCase$invoke$1.I$0 = i;
        getLoadMoneyDenominationsUseCase$invoke$1.J$0 = j;
        getLoadMoneyDenominationsUseCase$invoke$1.label = 2;
        Object objA = a(getLoadMoneyDenominationsUseCase$invoke$1);
        if (objA != obj2) {
            i3 = i;
            j2 = j;
            list = arrayListB0;
            obj = objA;
            list2 = arrayList2;
            List listA1 = CollectionsKt.a0((Iterable) obj, CollectionsKt.G0(list2));
            arrayList = new ArrayList();
            while (r15.hasNext()) {
                if (((Number) obj3).intValue() >= j2) {
                    arrayList.add(obj3);
                }
            }
            size = i3 - list2.size();
            while (i8 < size) {
                if (arrayList.size() > i8) {
                    list.add(arrayList.get(i8));
                }
            }
            return CollectionsKt.u0(list);
        }
        return obj2;
    }
}
