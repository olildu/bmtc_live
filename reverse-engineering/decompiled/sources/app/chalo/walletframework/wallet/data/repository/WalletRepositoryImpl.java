package app.chalo.walletframework.wallet.data.repository;

import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.models.ordercreation.CreateOrderResponseApiModelKt;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.walletframework.quickpay.data.mapper.QuickPayModelsMapperKt;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest;
import app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource;
import app.chalo.walletframework.wallet.data.mapper.WalletApiModelToAppModelMapperKt;
import app.chalo.walletframework.wallet.data.mapper.WalletAppModelToEntityModelMapperKt;
import app.chalo.walletframework.wallet.data.mapper.WalletEntityToAppModelMapperKt;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import app.chalo.walletframework.wallet.data.model.NoWalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.apimodel.request.ClosedLoopWalletMigrationRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.ClosedLoopWalletRegisterRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.WalletMigrationRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.request.WalletRechargeOrderRequestApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.AllWalletsSyncResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.ClosedLoopWalletRegisterResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.ClosedLoopWalletResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletLoadBalanceConfigBaseApiResponseModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletLoadBalanceConfigurationApiResponseModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletMetaResponseApiModel;
import app.chalo.walletframework.wallet.data.model.apimodel.response.WalletMigrationResponseApiModel;
import app.chalo.walletframework.wallet.data.model.appmodel.AllWalletsSyncResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.ChaloPayResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.ClosedLoopWalletResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.LoadMoneyAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletLoadBalanceConfigListAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletMetaResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSource;
import app.chalo.walletframework.wallet.data.repository.entity.ChaloPayEntity;
import app.chalo.walletframework.wallet.data.repository.entity.LoadMoneyEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletEntity;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/data/repository/WalletRepositoryImpl;", "Lapp/chalo/walletframework/wallet/data/repository/WalletRepository;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletRepositoryImpl implements WalletRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletLocalDataSource f11019a;
    public final WalletRemoteDataSource b;

    public WalletRepositoryImpl(WalletLocalDataSource walletLocalDataSource, WalletRemoteDataSource walletRemoteDataSource) {
        this.f11019a = walletLocalDataSource;
        this.b = walletRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Serializable A(String str, String str2, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$getUnsyncedWalletTransactions$4 walletRepositoryImpl$getUnsyncedWalletTransactions$4;
        if (continuationImpl instanceof WalletRepositoryImpl$getUnsyncedWalletTransactions$4) {
            walletRepositoryImpl$getUnsyncedWalletTransactions$4 = (WalletRepositoryImpl$getUnsyncedWalletTransactions$4) continuationImpl;
            int i = walletRepositoryImpl$getUnsyncedWalletTransactions$4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$getUnsyncedWalletTransactions$4.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$getUnsyncedWalletTransactions$4 = new WalletRepositoryImpl$getUnsyncedWalletTransactions$4(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$getUnsyncedWalletTransactions$4 = new WalletRepositoryImpl$getUnsyncedWalletTransactions$4(this, continuationImpl);
        }
        Object objX = walletRepositoryImpl$getUnsyncedWalletTransactions$4.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$getUnsyncedWalletTransactions$4.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            walletRepositoryImpl$getUnsyncedWalletTransactions$4.label = 1;
            objX = this.f11019a.x(str, str2, walletRepositoryImpl$getUnsyncedWalletTransactions$4);
            if (objX == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objX);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objX) {
            if (((WalletTransactionEntity) obj).g == WalletTransactionStatus.UNSYNCED) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList2.add(WalletEntityToAppModelMapperKt.b((WalletTransactionEntity) obj2));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object B(int i, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1 walletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1;
        if (continuationImpl instanceof WalletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1) {
            walletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1 = (WalletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1) continuationImpl;
            int i2 = walletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1 = new WalletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1 = new WalletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1(this, continuationImpl);
        }
        Object objK = walletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = walletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1.label;
        if (i3 == 0) {
            ResultKt.b(objK);
            WalletRechargeOrderRequestApiModel walletRechargeOrderRequestApiModel = new WalletRechargeOrderRequestApiModel(str3, i, str, str2, null);
            walletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1.label = 1;
            objK = this.b.k(walletRechargeOrderRequestApiModel, walletRepositoryImpl$placeSemiClosedWalletLoadBalanceRechargeOrder$1);
            if (objK == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objK);
        }
        return CreateOrderResponseApiModelKt.a((CreateOrderResponseApiModel) objK);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object C(WalletAppModel walletAppModel, List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ContinuationImpl continuationImpl) {
        ArrayList arrayList4 = new ArrayList(CollectionsKt.v(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList4.add(QuickPayModelsMapperKt.b((QuickPayAppModel) obj));
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.v(arrayList3, 10));
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            ChaloPayResponseAppModel chaloPayResponseAppModel = (ChaloPayResponseAppModel) obj2;
            Intrinsics.i(chaloPayResponseAppModel, "<this>");
            arrayList5.add(new ChaloPayEntity(chaloPayResponseAppModel.f11002a, chaloPayResponseAppModel.b, chaloPayResponseAppModel.c, chaloPayResponseAppModel.d, chaloPayResponseAppModel.e, chaloPayResponseAppModel.f, chaloPayResponseAppModel.g, chaloPayResponseAppModel.h));
        }
        WalletEntity walletEntityA = WalletAppModelToEntityModelMapperKt.a(walletAppModel);
        List list2 = list;
        ArrayList arrayList6 = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            WalletTransactionAppModel walletTransactionAppModel = (WalletTransactionAppModel) it.next();
            Intrinsics.i(walletTransactionAppModel, "<this>");
            arrayList6.add(new WalletTransactionEntity(walletTransactionAppModel.f11016a, walletTransactionAppModel.b, walletTransactionAppModel.c, walletTransactionAppModel.d, walletTransactionAppModel.e, walletTransactionAppModel.f, walletTransactionAppModel.g, walletTransactionAppModel.h));
            walletEntityA = walletEntityA;
            it = it;
            arrayList4 = arrayList4;
        }
        WalletEntity walletEntity = walletEntityA;
        ArrayList arrayList7 = arrayList4;
        List listA = WalletRepositoryImplKt.a(list, WalletTransactionType.QUICK_PAY);
        ArrayList arrayList8 = new ArrayList(CollectionsKt.v(arrayList2, 10));
        int i3 = 0;
        for (int size3 = arrayList2.size(); i3 < size3; size3 = size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            LoadMoneyAppModel loadMoneyAppModel = (LoadMoneyAppModel) obj3;
            Intrinsics.i(loadMoneyAppModel, "<this>");
            arrayList8.add(new LoadMoneyEntity(loadMoneyAppModel.f11004a, loadMoneyAppModel.b, loadMoneyAppModel.c, loadMoneyAppModel.d, loadMoneyAppModel.e, loadMoneyAppModel.f, loadMoneyAppModel.g, loadMoneyAppModel.h));
        }
        Object objY = this.f11019a.y(walletEntity, arrayList6, arrayList7, listA, arrayList8, arrayList5, WalletRepositoryImplKt.a(list, WalletTransactionType.CHALO_PAY), continuationImpl);
        return objY == CoroutineSingletons.COROUTINE_SUSPENDED ? objY : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object D(ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1 walletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1;
        ArrayList arrayList;
        if (continuationImpl instanceof WalletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1) {
            walletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1 = (WalletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1) continuationImpl;
            int i = walletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1 = new WalletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1 = new WalletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1(this, continuationImpl);
        }
        Object objL = walletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            walletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1.label = 1;
            objL = this.b.l(walletRepositoryImpl$getWalletLoadBalanceConfigAppModel$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objL);
        }
        WalletLoadBalanceConfigBaseApiResponseModel walletLoadBalanceConfigBaseApiResponseModel = (WalletLoadBalanceConfigBaseApiResponseModel) objL;
        Intrinsics.i(walletLoadBalanceConfigBaseApiResponseModel, "<this>");
        List list = walletLoadBalanceConfigBaseApiResponseModel.f10989a;
        ArrayList arrayList2 = null;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(WalletApiModelToAppModelMapperKt.b((WalletLoadBalanceConfigurationApiResponseModel) it.next()));
            }
        } else {
            arrayList = null;
        }
        List list3 = walletLoadBalanceConfigBaseApiResponseModel.b;
        if (list3 != null) {
            List list4 = list3;
            arrayList2 = new ArrayList(CollectionsKt.v(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList2.add(WalletApiModelToAppModelMapperKt.b((WalletLoadBalanceConfigurationApiResponseModel) it2.next()));
            }
        }
        return new WalletLoadBalanceConfigListAppModel(arrayList, arrayList2);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object E(int i, Continuation continuation) {
        return this.f11019a.G(i, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Serializable F(String str, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$getAllWalletAppModels$1 walletRepositoryImpl$getAllWalletAppModels$1;
        if (continuationImpl instanceof WalletRepositoryImpl$getAllWalletAppModels$1) {
            walletRepositoryImpl$getAllWalletAppModels$1 = (WalletRepositoryImpl$getAllWalletAppModels$1) continuationImpl;
            int i = walletRepositoryImpl$getAllWalletAppModels$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$getAllWalletAppModels$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$getAllWalletAppModels$1 = new WalletRepositoryImpl$getAllWalletAppModels$1(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$getAllWalletAppModels$1 = new WalletRepositoryImpl$getAllWalletAppModels$1(this, continuationImpl);
        }
        Object objL = walletRepositoryImpl$getAllWalletAppModels$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$getAllWalletAppModels$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            walletRepositoryImpl$getAllWalletAppModels$1.label = 1;
            objL = this.f11019a.l(str, walletRepositoryImpl$getAllWalletAppModels$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objL);
        }
        Iterable iterable = (Iterable) objL;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(WalletEntityToAppModelMapperKt.a((WalletEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object G(String str, String str2, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$getChaloPayAppModel$1 walletRepositoryImpl$getChaloPayAppModel$1;
        if (continuationImpl instanceof WalletRepositoryImpl$getChaloPayAppModel$1) {
            walletRepositoryImpl$getChaloPayAppModel$1 = (WalletRepositoryImpl$getChaloPayAppModel$1) continuationImpl;
            int i = walletRepositoryImpl$getChaloPayAppModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$getChaloPayAppModel$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$getChaloPayAppModel$1 = new WalletRepositoryImpl$getChaloPayAppModel$1(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$getChaloPayAppModel$1 = new WalletRepositoryImpl$getChaloPayAppModel$1(this, continuationImpl);
        }
        Object objM = walletRepositoryImpl$getChaloPayAppModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$getChaloPayAppModel$1.label;
        if (i2 == 0) {
            ResultKt.b(objM);
            walletRepositoryImpl$getChaloPayAppModel$1.label = 1;
            objM = this.f11019a.m(str, str2, walletRepositoryImpl$getChaloPayAppModel$1);
            if (objM == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objM);
        }
        ChaloPayEntity chaloPayEntity = (ChaloPayEntity) objM;
        if (chaloPayEntity == null) {
            return null;
        }
        return new ChaloPayResponseAppModel(chaloPayEntity.f11030a, chaloPayEntity.b, chaloPayEntity.c, chaloPayEntity.d, chaloPayEntity.e, chaloPayEntity.f, chaloPayEntity.g, chaloPayEntity.h);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[PHI: r11 r12
      0x0099: PHI (r11v4 java.lang.String) = (r11v3 java.lang.String), (r11v14 java.lang.String) binds: [B:28:0x0096, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r12v4 java.lang.String) = (r12v3 java.lang.String), (r12v10 java.lang.String) binds: [B:28:0x0096, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r8.D(r12, r11, r0) == r1) goto L32;
     */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(java.lang.String r11, java.lang.String r12, app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$deleteWalletFromRoomAndUpdateWalletPrefsStorage$1
            if (r0 == 0) goto L13
            r0 = r14
            app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$deleteWalletFromRoomAndUpdateWalletPrefsStorage$1 r0 = (app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$deleteWalletFromRoomAndUpdateWalletPrefsStorage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$deleteWalletFromRoomAndUpdateWalletPrefsStorage$1 r0 = new app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$deleteWalletFromRoomAndUpdateWalletPrefsStorage$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource r8 = r10.f11019a
            if (r2 == 0) goto L66
            if (r2 == r6) goto L54
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.ResultKt.b(r14)
            goto La6
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            java.lang.Object r11 = r0.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.L$0
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.b(r14)
            goto L99
        L48:
            java.lang.Object r11 = r0.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.L$0
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.b(r14)
            goto L8c
        L54:
            java.lang.Object r11 = r0.L$2
            r13 = r11
            app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest r13 = (app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest) r13
            java.lang.Object r11 = r0.L$1
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.L$0
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.b(r14)
            goto L78
        L66:
            kotlin.ResultKt.b(r14)
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r13
            r0.label = r6
            java.lang.Object r14 = r8.H(r11, r12, r0)
            if (r14 != r1) goto L78
            goto La5
        L78:
            app.chalo.walletframework.wallet.data.model.NoWalletStatus r14 = app.chalo.walletframework.wallet.data.model.NoWalletStatus.DOES_NOT_EXIST
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r7
            r0.label = r5
            java.lang.Object r13 = r10.t(r13, r14, r0)
            if (r13 != r1) goto L89
            goto La5
        L89:
            r9 = r12
            r12 = r11
            r11 = r9
        L8c:
            r0.L$0 = r12
            r0.L$1 = r11
            r0.label = r4
            java.lang.Object r13 = r8.F(r12, r11, r0)
            if (r13 != r1) goto L99
            goto La5
        L99:
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r11 = r8.D(r12, r11, r0)
            if (r11 != r1) goto La6
        La5:
            return r1
        La6:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl.H(java.lang.String, java.lang.String, app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$2] */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$2 I(String userId, String walletId) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletId, "walletId");
        final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1E = this.f11019a.E(userId, walletId);
        return new Flow<List<? extends WalletTransactionAppModel>>() { // from class: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$2

            /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f11029a;

                /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$2$2", f = "WalletRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f11029a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(WalletEntityToAppModelMapperKt.b((WalletTransactionEntity) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f11029a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1E.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object J(String str, String str2, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$getWalletAppModel$1 walletRepositoryImpl$getWalletAppModel$1;
        if (continuationImpl instanceof WalletRepositoryImpl$getWalletAppModel$1) {
            walletRepositoryImpl$getWalletAppModel$1 = (WalletRepositoryImpl$getWalletAppModel$1) continuationImpl;
            int i = walletRepositoryImpl$getWalletAppModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$getWalletAppModel$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$getWalletAppModel$1 = new WalletRepositoryImpl$getWalletAppModel$1(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$getWalletAppModel$1 = new WalletRepositoryImpl$getWalletAppModel$1(this, continuationImpl);
        }
        Object objR = walletRepositoryImpl$getWalletAppModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$getWalletAppModel$1.label;
        if (i2 == 0) {
            ResultKt.b(objR);
            walletRepositoryImpl$getWalletAppModel$1.label = 1;
            objR = this.f11019a.r(str, str2, walletRepositoryImpl$getWalletAppModel$1);
            if (objR == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objR);
        }
        WalletEntity walletEntity = (WalletEntity) objR;
        if (walletEntity != null) {
            return WalletEntityToAppModelMapperKt.a(walletEntity);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Serializable K(String str, String str2, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$getWalletTransactionAppModelList$3 walletRepositoryImpl$getWalletTransactionAppModelList$3;
        if (continuationImpl instanceof WalletRepositoryImpl$getWalletTransactionAppModelList$3) {
            walletRepositoryImpl$getWalletTransactionAppModelList$3 = (WalletRepositoryImpl$getWalletTransactionAppModelList$3) continuationImpl;
            int i = walletRepositoryImpl$getWalletTransactionAppModelList$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$getWalletTransactionAppModelList$3.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$getWalletTransactionAppModelList$3 = new WalletRepositoryImpl$getWalletTransactionAppModelList$3(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$getWalletTransactionAppModelList$3 = new WalletRepositoryImpl$getWalletTransactionAppModelList$3(this, continuationImpl);
        }
        Object objX = walletRepositoryImpl$getWalletTransactionAppModelList$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$getWalletTransactionAppModelList$3.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            walletRepositoryImpl$getWalletTransactionAppModelList$3.label = 1;
            objX = this.f11019a.x(str, str2, walletRepositoryImpl$getWalletTransactionAppModelList$3);
            if (objX == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objX);
        }
        Iterable iterable = (Iterable) objX;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(WalletEntityToAppModelMapperKt.b((WalletTransactionEntity) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object L(String str, String str2, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$getLoadMoneyAppModel$1 walletRepositoryImpl$getLoadMoneyAppModel$1;
        if (continuationImpl instanceof WalletRepositoryImpl$getLoadMoneyAppModel$1) {
            walletRepositoryImpl$getLoadMoneyAppModel$1 = (WalletRepositoryImpl$getLoadMoneyAppModel$1) continuationImpl;
            int i = walletRepositoryImpl$getLoadMoneyAppModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$getLoadMoneyAppModel$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$getLoadMoneyAppModel$1 = new WalletRepositoryImpl$getLoadMoneyAppModel$1(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$getLoadMoneyAppModel$1 = new WalletRepositoryImpl$getLoadMoneyAppModel$1(this, continuationImpl);
        }
        Object objP = walletRepositoryImpl$getLoadMoneyAppModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$getLoadMoneyAppModel$1.label;
        if (i2 == 0) {
            ResultKt.b(objP);
            walletRepositoryImpl$getLoadMoneyAppModel$1.label = 1;
            objP = this.f11019a.p(str, str2, walletRepositoryImpl$getLoadMoneyAppModel$1);
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        LoadMoneyEntity loadMoneyEntity = (LoadMoneyEntity) objP;
        if (loadMoneyEntity != null) {
            return new LoadMoneyAppModel(loadMoneyEntity.f11031a, loadMoneyEntity.b, loadMoneyEntity.c, loadMoneyEntity.d, loadMoneyEntity.e, loadMoneyEntity.f, loadMoneyEntity.g, loadMoneyEntity.h);
        }
        return null;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object a(WalletTransactionEntity walletTransactionEntity, int i, ContinuationImpl continuationImpl) {
        Object objA = this.f11019a.a(walletTransactionEntity, i, continuationImpl);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object b(Continuation continuation) {
        Object objB = this.f11019a.b(continuation);
        return objB == CoroutineSingletons.COROUTINE_SUSPENDED ? objB : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object c(String str, String str2, CachedWalletStatus cachedWalletStatus, Continuation continuation) {
        Object objC = this.f11019a.c(str, str2, cachedWalletStatus, continuation);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object d(Continuation continuation) {
        Object objD = this.f11019a.d(continuation);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object e(Continuation continuation) {
        Object objE = this.f11019a.e(continuation);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object f(WalletMigrationRequestApiModel walletMigrationRequestApiModel, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$semiClosedWalletAutoReclaim$1 walletRepositoryImpl$semiClosedWalletAutoReclaim$1;
        if (continuationImpl instanceof WalletRepositoryImpl$semiClosedWalletAutoReclaim$1) {
            walletRepositoryImpl$semiClosedWalletAutoReclaim$1 = (WalletRepositoryImpl$semiClosedWalletAutoReclaim$1) continuationImpl;
            int i = walletRepositoryImpl$semiClosedWalletAutoReclaim$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$semiClosedWalletAutoReclaim$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$semiClosedWalletAutoReclaim$1 = new WalletRepositoryImpl$semiClosedWalletAutoReclaim$1(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$semiClosedWalletAutoReclaim$1 = new WalletRepositoryImpl$semiClosedWalletAutoReclaim$1(this, continuationImpl);
        }
        Object objF = walletRepositoryImpl$semiClosedWalletAutoReclaim$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$semiClosedWalletAutoReclaim$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            walletRepositoryImpl$semiClosedWalletAutoReclaim$1.label = 1;
            objF = this.b.f(walletMigrationRequestApiModel, walletRepositoryImpl$semiClosedWalletAutoReclaim$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        return Boolean.valueOf(StringsKt.x(((WalletMigrationResponseApiModel) objF).f10995a, FirebaseAnalytics.Param.SUCCESS, true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object g(ClosedLoopWalletMigrationRequestApiModel closedLoopWalletMigrationRequestApiModel, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$closedLoopWalletAutoReclaim$1 walletRepositoryImpl$closedLoopWalletAutoReclaim$1;
        if (continuationImpl instanceof WalletRepositoryImpl$closedLoopWalletAutoReclaim$1) {
            walletRepositoryImpl$closedLoopWalletAutoReclaim$1 = (WalletRepositoryImpl$closedLoopWalletAutoReclaim$1) continuationImpl;
            int i = walletRepositoryImpl$closedLoopWalletAutoReclaim$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$closedLoopWalletAutoReclaim$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$closedLoopWalletAutoReclaim$1 = new WalletRepositoryImpl$closedLoopWalletAutoReclaim$1(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$closedLoopWalletAutoReclaim$1 = new WalletRepositoryImpl$closedLoopWalletAutoReclaim$1(this, continuationImpl);
        }
        Object objG = walletRepositoryImpl$closedLoopWalletAutoReclaim$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$closedLoopWalletAutoReclaim$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            walletRepositoryImpl$closedLoopWalletAutoReclaim$1.label = 1;
            objG = this.b.g(closedLoopWalletMigrationRequestApiModel, walletRepositoryImpl$closedLoopWalletAutoReclaim$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        return Boolean.valueOf(StringsKt.x(((WalletMigrationResponseApiModel) objG).f10995a, FirebaseAnalytics.Param.SUCCESS, true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object h(WalletMigrationRequestApiModel walletMigrationRequestApiModel, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$postDeviceIdForWalletMigration$1 walletRepositoryImpl$postDeviceIdForWalletMigration$1;
        if (continuationImpl instanceof WalletRepositoryImpl$postDeviceIdForWalletMigration$1) {
            walletRepositoryImpl$postDeviceIdForWalletMigration$1 = (WalletRepositoryImpl$postDeviceIdForWalletMigration$1) continuationImpl;
            int i = walletRepositoryImpl$postDeviceIdForWalletMigration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$postDeviceIdForWalletMigration$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$postDeviceIdForWalletMigration$1 = new WalletRepositoryImpl$postDeviceIdForWalletMigration$1(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$postDeviceIdForWalletMigration$1 = new WalletRepositoryImpl$postDeviceIdForWalletMigration$1(this, continuationImpl);
        }
        Object objH = walletRepositoryImpl$postDeviceIdForWalletMigration$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$postDeviceIdForWalletMigration$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            walletRepositoryImpl$postDeviceIdForWalletMigration$1.label = 1;
            objH = this.b.h(walletMigrationRequestApiModel, walletRepositoryImpl$postDeviceIdForWalletMigration$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        return Boolean.valueOf(StringsKt.x(((WalletMigrationResponseApiModel) objH).f10995a, "SUCCESS", true));
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object i(NoWalletStatus noWalletStatus, Continuation continuation) {
        Object objI = this.f11019a.i(noWalletStatus, continuation);
        return objI == CoroutineSingletons.COROUTINE_SUSPENDED ? objI : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object j(String str, String str2, long j, ContinuationImpl continuationImpl) {
        Object objJ = this.f11019a.j(str, str2, j, continuationImpl);
        return objJ == CoroutineSingletons.COROUTINE_SUSPENDED ? objJ : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object k(String str, String str2, long j, ContinuationImpl continuationImpl) {
        Object objK = this.f11019a.k(str, str2, j, continuationImpl);
        return objK == CoroutineSingletons.COROUTINE_SUSPENDED ? objK : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$1] */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$1 l(String str) {
        final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1B = this.f11019a.B(str);
        return new Flow<List<? extends WalletTransactionAppModel>>() { // from class: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f11027a;

                /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletTransactionAppModelListAsFlow$$inlined$map$1$2", f = "WalletRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f11027a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(WalletEntityToAppModelMapperKt.b((WalletTransactionEntity) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (this.f11027a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1B.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object m(String str, String str2, String str3, ContinuationImpl continuationImpl) throws NetworkSuccessResponseParseException {
        WalletRepositoryImpl$registerClosedLoopWallet$1 walletRepositoryImpl$registerClosedLoopWallet$1;
        if (continuationImpl instanceof WalletRepositoryImpl$registerClosedLoopWallet$1) {
            walletRepositoryImpl$registerClosedLoopWallet$1 = (WalletRepositoryImpl$registerClosedLoopWallet$1) continuationImpl;
            int i = walletRepositoryImpl$registerClosedLoopWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$registerClosedLoopWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$registerClosedLoopWallet$1 = new WalletRepositoryImpl$registerClosedLoopWallet$1(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$registerClosedLoopWallet$1 = new WalletRepositoryImpl$registerClosedLoopWallet$1(this, continuationImpl);
        }
        Object objM = walletRepositoryImpl$registerClosedLoopWallet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$registerClosedLoopWallet$1.label;
        if (i2 == 0) {
            ResultKt.b(objM);
            ClosedLoopWalletRegisterRequestApiModel closedLoopWalletRegisterRequestApiModel = new ClosedLoopWalletRegisterRequestApiModel(str, str2, str3);
            walletRepositoryImpl$registerClosedLoopWallet$1.label = 1;
            objM = this.b.m(closedLoopWalletRegisterRequestApiModel, walletRepositoryImpl$registerClosedLoopWallet$1);
            if (objM == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objM);
        }
        ClosedLoopWalletResponseApiModel closedLoopWalletResponseApiModel = ((ClosedLoopWalletRegisterResponseApiModel) objM).b;
        if (closedLoopWalletResponseApiModel != null) {
            return new ClosedLoopWalletResponseAppModel(closedLoopWalletResponseApiModel.f10983a, closedLoopWalletResponseApiModel.b);
        }
        throw new NetworkSuccessResponseParseException("Closed-loop register response missing wallet detail");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        if (r3 == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012c, code lost:
    
        if (r3 == r5) goto L37;
     */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(app.chalo.walletframework.wallet.data.model.appmodel.WalletSyncRequestAppModel r24, app.chalo.features.wallet.WalletSyncRequest r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl.n(app.chalo.walletframework.wallet.data.model.appmodel.WalletSyncRequestAppModel, app.chalo.features.wallet.WalletSyncRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object o(String str, String str2, ContinuationImpl continuationImpl) {
        return this.f11019a.o(str, str2, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object p(int i, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1 walletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1;
        if (continuationImpl instanceof WalletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1) {
            walletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1 = (WalletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1) continuationImpl;
            int i2 = walletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1 = new WalletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1 = new WalletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1(this, continuationImpl);
        }
        Object objN = walletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = walletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1.label;
        if (i3 == 0) {
            ResultKt.b(objN);
            WalletRechargeOrderRequestApiModel walletRechargeOrderRequestApiModel = new WalletRechargeOrderRequestApiModel(str3, i, str, str2, str4);
            walletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1.label = 1;
            objN = this.b.n(walletRechargeOrderRequestApiModel, walletRepositoryImpl$placeClosedLoopWalletLoadBalanceRechargeOrder$1);
            if (objN == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objN);
        }
        return CreateOrderResponseApiModelKt.a((CreateOrderResponseApiModel) objN);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object q(NoWalletStatusRequest noWalletStatusRequest, ContinuationImpl continuationImpl) {
        return this.f11019a.q(noWalletStatusRequest, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object r(String str, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$getAllWalletsMetaData$1 walletRepositoryImpl$getAllWalletsMetaData$1;
        ?? arrayList;
        String lowerCase;
        if (continuationImpl instanceof WalletRepositoryImpl$getAllWalletsMetaData$1) {
            walletRepositoryImpl$getAllWalletsMetaData$1 = (WalletRepositoryImpl$getAllWalletsMetaData$1) continuationImpl;
            int i = walletRepositoryImpl$getAllWalletsMetaData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$getAllWalletsMetaData$1.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$getAllWalletsMetaData$1 = new WalletRepositoryImpl$getAllWalletsMetaData$1(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$getAllWalletsMetaData$1 = new WalletRepositoryImpl$getAllWalletsMetaData$1(this, continuationImpl);
        }
        Object objO = walletRepositoryImpl$getAllWalletsMetaData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$getAllWalletsMetaData$1.label;
        if (i2 == 0) {
            ResultKt.b(objO);
            walletRepositoryImpl$getAllWalletsMetaData$1.label = 1;
            objO = this.b.o(str, walletRepositoryImpl$getAllWalletsMetaData$1);
            if (objO == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objO);
        }
        AllWalletsSyncResponseApiModel allWalletsSyncResponseApiModel = (AllWalletsSyncResponseApiModel) objO;
        Intrinsics.i(allWalletsSyncResponseApiModel, "<this>");
        List list = allWalletsSyncResponseApiModel.b;
        if (list != null) {
            List<WalletMetaResponseApiModel> list2 = list;
            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (WalletMetaResponseApiModel walletMetaResponseApiModel : list2) {
                Intrinsics.i(walletMetaResponseApiModel, "<this>");
                String str2 = walletMetaResponseApiModel.f10993a;
                String str3 = walletMetaResponseApiModel.b;
                String str4 = walletMetaResponseApiModel.c;
                if (str4 != null) {
                    lowerCase = str4.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = null;
                }
                arrayList.add(new WalletMetaResponseAppModel(str2, str3, lowerCase));
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        return new AllWalletsSyncResponseAppModel(arrayList);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object s(String str, String str2, Continuation continuation) {
        return this.f11019a.s(str, str2, continuation);
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object t(NoWalletStatusRequest noWalletStatusRequest, NoWalletStatus noWalletStatus, ContinuationImpl continuationImpl) {
        Object objT = this.f11019a.t(noWalletStatusRequest, noWalletStatus, continuationImpl);
        return objT == CoroutineSingletons.COROUTINE_SUSPENDED ? objT : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object u(WalletTransactionAppModel walletTransactionAppModel, LoadMoneyAppModel loadMoneyAppModel, Continuation continuation) {
        Object objW = this.f11019a.w(new WalletTransactionEntity(walletTransactionAppModel.f11016a, walletTransactionAppModel.b, walletTransactionAppModel.c, walletTransactionAppModel.d, walletTransactionAppModel.e, walletTransactionAppModel.f, walletTransactionAppModel.g, walletTransactionAppModel.h), new LoadMoneyEntity(loadMoneyAppModel.f11004a, loadMoneyAppModel.b, loadMoneyAppModel.c, loadMoneyAppModel.d, loadMoneyAppModel.e, loadMoneyAppModel.f, loadMoneyAppModel.g, loadMoneyAppModel.h), continuation);
        return objW == CoroutineSingletons.COROUTINE_SUSPENDED ? objW : Unit.f17538a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getChaloPayTransactionAppModelListAsFlow$$inlined$map$1] */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final WalletRepositoryImpl$getChaloPayTransactionAppModelListAsFlow$$inlined$map$1 v() {
        final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1C = this.f11019a.C();
        return new Flow<List<? extends ChaloPayResponseAppModel>>() { // from class: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getChaloPayTransactionAppModelListAsFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getChaloPayTransactionAppModelListAsFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f11021a;

                /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getChaloPayTransactionAppModelListAsFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getChaloPayTransactionAppModelListAsFlow$$inlined$map$1$2", f = "WalletRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f11021a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        List<ChaloPayEntity> list = (List) obj;
                        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                        for (ChaloPayEntity chaloPayEntity : list) {
                            Intrinsics.i(chaloPayEntity, "<this>");
                            arrayList.add(new ChaloPayResponseAppModel(chaloPayEntity.f11030a, chaloPayEntity.b, chaloPayEntity.c, chaloPayEntity.d, chaloPayEntity.e, chaloPayEntity.f, chaloPayEntity.g, chaloPayEntity.h));
                        }
                        anonymousClass1.label = 1;
                        if (this.f11021a.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1C.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final ChannelFlowTransformLatest w(String str, WalletTypeIdentifier walletTypeIdentifier) {
        Intrinsics.i(walletTypeIdentifier, "walletTypeIdentifier");
        return FlowKt.H(this.f11019a.n(str, walletTypeIdentifier.f10959a, walletTypeIdentifier.b), new WalletRepositoryImpl$getWalletTransactionAppModelListForTypeAsFlow$$inlined$flatMapLatest$1(null, this, str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object x(String str, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        WalletRepositoryImpl$getWalletAppModel$2 walletRepositoryImpl$getWalletAppModel$2;
        if (continuationImpl instanceof WalletRepositoryImpl$getWalletAppModel$2) {
            walletRepositoryImpl$getWalletAppModel$2 = (WalletRepositoryImpl$getWalletAppModel$2) continuationImpl;
            int i = walletRepositoryImpl$getWalletAppModel$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletRepositoryImpl$getWalletAppModel$2.label = i - Integer.MIN_VALUE;
            } else {
                walletRepositoryImpl$getWalletAppModel$2 = new WalletRepositoryImpl$getWalletAppModel$2(this, continuationImpl);
            }
        } else {
            walletRepositoryImpl$getWalletAppModel$2 = new WalletRepositoryImpl$getWalletAppModel$2(this, continuationImpl);
        }
        Object objU = walletRepositoryImpl$getWalletAppModel$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletRepositoryImpl$getWalletAppModel$2.label;
        if (i2 == 0) {
            ResultKt.b(objU);
            WalletType walletType = walletTypeIdentifier.f10959a;
            String str2 = walletTypeIdentifier.b;
            walletRepositoryImpl$getWalletAppModel$2.label = 1;
            objU = this.f11019a.u(str, walletType, str2, walletRepositoryImpl$getWalletAppModel$2);
            if (objU == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objU);
        }
        WalletEntity walletEntity = (WalletEntity) objU;
        if (walletEntity != null) {
            return WalletEntityToAppModelMapperKt.a(walletEntity);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletAppModelFlow$$inlined$map$1] */
    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final WalletRepositoryImpl$getWalletAppModelFlow$$inlined$map$1 y(String userId, WalletTypeIdentifier walletTypeIdentifier) {
        Intrinsics.i(userId, "userId");
        Intrinsics.i(walletTypeIdentifier, "walletTypeIdentifier");
        final Flow flowN = this.f11019a.n(userId, walletTypeIdentifier.f10959a, walletTypeIdentifier.b);
        return new Flow<WalletAppModel>() { // from class: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletAppModelFlow$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletAppModelFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f11023a;

                /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletAppModelFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl$getWalletAppModelFlow$$inlined$map$1$2", f = "WalletRepositoryImpl.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f11023a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        WalletEntity walletEntity = (WalletEntity) obj;
                        WalletAppModel walletAppModelA = walletEntity != null ? WalletEntityToAppModelMapperKt.a(walletEntity) : null;
                        anonymousClass1.label = 1;
                        if (this.f11023a.emit(walletAppModelA, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowN.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
    }

    @Override // app.chalo.walletframework.wallet.data.repository.WalletRepository
    public final Object z(WalletAppModel walletAppModel, ContinuationImpl continuationImpl) {
        Object objV = this.f11019a.v(WalletAppModelToEntityModelMapperKt.a(walletAppModel), continuationImpl);
        return objV == CoroutineSingletons.COROUTINE_SUSPENDED ? objV : Unit.f17538a;
    }
}
