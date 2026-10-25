package app.chalo.tito.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.tito.data.TITOValidationDataRepository;
import app.chalo.titoridedetail.data.app.TITOProductDetailAppModel;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/domain/GetActiveTitoTripsAndUpdateRestUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetActiveTitoTripsAndUpdateRestUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TITOValidationDataRepository f9657a;
    public final UserProfileDetailsProvider b;
    public final GetAllActiveTappedInTripsUseCase c;
    public final GroupAsActiveExpiredAndUnknownFromProductsListUseCase d;

    public GetActiveTitoTripsAndUpdateRestUseCase(TITOValidationDataRepository tITOValidationDataRepository, UserProfileDetailsProvider userProfileDetailsProvider, GetAllActiveTappedInTripsUseCase getAllActiveTappedInTripsUseCase, GroupAsActiveExpiredAndUnknownFromProductsListUseCase groupAsActiveExpiredAndUnknownFromProductsListUseCase) {
        this.f9657a = tITOValidationDataRepository;
        this.b = userProfileDetailsProvider;
        this.c = getAllActiveTappedInTripsUseCase;
        this.d = groupAsActiveExpiredAndUnknownFromProductsListUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0095 A[LOOP:1: B:31:0x008f->B:33:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(ContinuationImpl continuationImpl) {
        GetActiveTitoTripsAndUpdateRestUseCase$invoke$1 getActiveTitoTripsAndUpdateRestUseCase$invoke$1;
        List listV0;
        ArrayList arrayList;
        Iterator it;
        Object objA;
        List list;
        TITOProductDetailsFilterWrapper tITOProductDetailsFilterWrapper;
        List list2;
        TITOProductDetailsFilterWrapper tITOProductDetailsFilterWrapper2;
        List list3;
        List list4;
        ArrayList arrayList2;
        int i;
        int i2;
        TITOValidationAppModel tITOValidationAppModel;
        if (continuationImpl instanceof GetActiveTitoTripsAndUpdateRestUseCase$invoke$1) {
            getActiveTitoTripsAndUpdateRestUseCase$invoke$1 = (GetActiveTitoTripsAndUpdateRestUseCase$invoke$1) continuationImpl;
            int i3 = getActiveTitoTripsAndUpdateRestUseCase$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                getActiveTitoTripsAndUpdateRestUseCase$invoke$1.label = i3 - Integer.MIN_VALUE;
            } else {
                getActiveTitoTripsAndUpdateRestUseCase$invoke$1 = new GetActiveTitoTripsAndUpdateRestUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getActiveTitoTripsAndUpdateRestUseCase$invoke$1 = new GetActiveTitoTripsAndUpdateRestUseCase$invoke$1(this, continuationImpl);
        }
        Object objK = getActiveTitoTripsAndUpdateRestUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = getActiveTitoTripsAndUpdateRestUseCase$invoke$1.label;
        if (i4 == 0) {
            ResultKt.b(objK);
            getActiveTitoTripsAndUpdateRestUseCase$invoke$1.label = 1;
            objK = this.b.k(getActiveTitoTripsAndUpdateRestUseCase$invoke$1);
            if (objK != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            ResultKt.b(objK);
        } else {
            if (i4 == 2) {
                ResultKt.b(objK);
                listV0 = CollectionsKt.v0(new GetActiveTitoTripsAndUpdateRestUseCase$invoke$$inlined$sortedByDescending$1(), (Iterable) objK);
                List list5 = listV0;
                arrayList = new ArrayList(CollectionsKt.v(list5, 10));
                it = list5.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TITOValidationAppModel) it.next()).c);
                }
                getActiveTitoTripsAndUpdateRestUseCase$invoke$1.L$0 = listV0;
                getActiveTitoTripsAndUpdateRestUseCase$invoke$1.label = 3;
                objA = this.d.a(arrayList, getActiveTitoTripsAndUpdateRestUseCase$invoke$1);
                if (objA != coroutineSingletons) {
                    list = listV0;
                    objK = objA;
                    tITOProductDetailsFilterWrapper = (TITOProductDetailsFilterWrapper) objK;
                    list2 = tITOProductDetailsFilterWrapper.b;
                    getActiveTitoTripsAndUpdateRestUseCase$invoke$1.L$0 = list;
                    getActiveTitoTripsAndUpdateRestUseCase$invoke$1.L$1 = tITOProductDetailsFilterWrapper;
                    getActiveTitoTripsAndUpdateRestUseCase$invoke$1.label = 4;
                    if (b(list, list2, getActiveTitoTripsAndUpdateRestUseCase$invoke$1) != coroutineSingletons) {
                        tITOProductDetailsFilterWrapper2 = tITOProductDetailsFilterWrapper;
                        list3 = list;
                    }
                }
                return coroutineSingletons;
            }
            if (i4 == 3) {
                list = (List) getActiveTitoTripsAndUpdateRestUseCase$invoke$1.L$0;
                ResultKt.b(objK);
                tITOProductDetailsFilterWrapper = (TITOProductDetailsFilterWrapper) objK;
                list2 = tITOProductDetailsFilterWrapper.b;
                getActiveTitoTripsAndUpdateRestUseCase$invoke$1.L$0 = list;
                getActiveTitoTripsAndUpdateRestUseCase$invoke$1.L$1 = tITOProductDetailsFilterWrapper;
                getActiveTitoTripsAndUpdateRestUseCase$invoke$1.label = 4;
                if (b(list, list2, getActiveTitoTripsAndUpdateRestUseCase$invoke$1) != coroutineSingletons) {
                    tITOProductDetailsFilterWrapper2 = tITOProductDetailsFilterWrapper;
                    list3 = list;
                }
                return coroutineSingletons;
            }
            if (i4 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tITOProductDetailsFilterWrapper2 = (TITOProductDetailsFilterWrapper) getActiveTitoTripsAndUpdateRestUseCase$invoke$1.L$1;
            list3 = (List) getActiveTitoTripsAndUpdateRestUseCase$invoke$1.L$0;
            ResultKt.b(objK);
        }
        list4 = tITOProductDetailsFilterWrapper2.f9666a;
        arrayList2 = new ArrayList();
        i = 0;
        i2 = 0;
        while (i < list4.size()) {
            tITOValidationAppModel = (TITOValidationAppModel) list3.get(i2);
            if (Intrinsics.d(tITOValidationAppModel.c.b.getC(), ((TITOProductDetailAppModel) list4.get(i)).b.getC())) {
                arrayList2.add(tITOValidationAppModel);
                i2++;
                i++;
            } else {
                i2++;
            }
        }
        return arrayList2;
        String str = (String) objK;
        if (str == null) {
            return EmptyList.f17557a;
        }
        getActiveTitoTripsAndUpdateRestUseCase$invoke$1.label = 2;
        objK = this.c.a(str, getActiveTitoTripsAndUpdateRestUseCase$invoke$1);
        if (objK != coroutineSingletons) {
            listV0 = CollectionsKt.v0(new GetActiveTitoTripsAndUpdateRestUseCase$invoke$$inlined$sortedByDescending$1(), (Iterable) objK);
            List list6 = listV0;
            arrayList = new ArrayList(CollectionsKt.v(list6, 10));
            it = list6.iterator();
            while (it.hasNext()) {
                arrayList.add(((TITOValidationAppModel) it.next()).c);
            }
            getActiveTitoTripsAndUpdateRestUseCase$invoke$1.L$0 = listV0;
            getActiveTitoTripsAndUpdateRestUseCase$invoke$1.label = 3;
            objA = this.d.a(arrayList, getActiveTitoTripsAndUpdateRestUseCase$invoke$1);
            if (objA != coroutineSingletons) {
                list = listV0;
                objK = objA;
                tITOProductDetailsFilterWrapper = (TITOProductDetailsFilterWrapper) objK;
                list2 = tITOProductDetailsFilterWrapper.b;
                getActiveTitoTripsAndUpdateRestUseCase$invoke$1.L$0 = list;
                getActiveTitoTripsAndUpdateRestUseCase$invoke$1.L$1 = tITOProductDetailsFilterWrapper;
                getActiveTitoTripsAndUpdateRestUseCase$invoke$1.label = 4;
                if (b(list, list2, getActiveTitoTripsAndUpdateRestUseCase$invoke$1) != coroutineSingletons) {
                    tITOProductDetailsFilterWrapper2 = tITOProductDetailsFilterWrapper;
                    list3 = list;
                    list4 = tITOProductDetailsFilterWrapper2.f9666a;
                    arrayList2 = new ArrayList();
                    i = 0;
                    i2 = 0;
                    while (i < list4.size()) {
                        tITOValidationAppModel = (TITOValidationAppModel) list3.get(i2);
                        if (Intrinsics.d(tITOValidationAppModel.c.b.getC(), ((TITOProductDetailAppModel) list4.get(i)).b.getC())) {
                            arrayList2.add(tITOValidationAppModel);
                            i2++;
                            i++;
                        } else {
                            i2++;
                        }
                    }
                    return arrayList2;
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x008c A[EDGE_INSN: B:24:0x008c->B:25:0x008e BREAK  A[LOOP:0: B:15:0x0046->B:26:0x0093]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0093 A[LOOP:0: B:15:0x0046->B:26:0x0093, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008c -> B:25:0x008e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r9, java.util.List r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase$markTappedInTripsAsExpiredForExpiredProducts$1
            if (r0 == 0) goto L13
            r0 = r11
            app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase$markTappedInTripsAsExpiredForExpiredProducts$1 r0 = (app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase$markTappedInTripsAsExpiredForExpiredProducts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase$markTappedInTripsAsExpiredForExpiredProducts$1 r0 = new app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase$markTappedInTripsAsExpiredForExpiredProducts$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.L$0
            java.util.List r4 = (java.util.List) r4
            kotlin.ResultKt.b(r11)
            r11 = r2
            r2 = r0
            goto L8e
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            kotlin.ResultKt.b(r11)
            r11 = 0
            r2 = r0
            r0 = r11
            r11 = r10
            r10 = r9
            r9 = r0
        L46:
            int r4 = r11.size()
            kotlin.Unit r5 = kotlin.Unit.f17538a
            if (r9 >= r4) goto L96
            java.lang.Object r4 = r10.get(r0)
            app.chalo.titoridedetail.data.app.TITOValidationAppModel r4 = (app.chalo.titoridedetail.data.app.TITOValidationAppModel) r4
            java.lang.Object r6 = r11.get(r9)
            app.chalo.titoridedetail.data.app.TITOProductDetailAppModel r6 = (app.chalo.titoridedetail.data.app.TITOProductDetailAppModel) r6
            app.chalo.titoridedetail.data.app.TITOProductDetailAppModel r7 = r4.c
            app.chalo.models.validation.ValidationProduct r7 = r7.b
            java.lang.String r7 = r7.getC()
            app.chalo.models.validation.ValidationProduct r6 = r6.b
            java.lang.String r6 = r6.getC()
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r7, r6)
            if (r6 == 0) goto L93
            r2.L$0 = r10
            r2.L$1 = r11
            r2.I$0 = r0
            r2.I$1 = r9
            r2.label = r3
            app.chalo.titoridedetail.data.app.TapInDetailAppModel r4 = r4.f9672a
            java.lang.String r4 = r4.f9673a
            app.chalo.titoridedetail.data.app.TitoValidationStatus r6 = app.chalo.titoridedetail.data.app.TitoValidationStatus.MISSED_TAP_OUT
            app.chalo.tito.data.TITOValidationDataRepository r7 = r8.f9657a
            java.lang.Object r4 = r7.a(r4, r6, r2)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r6) goto L89
            r5 = r4
        L89:
            if (r5 != r1) goto L8c
            return r1
        L8c:
            r4 = r10
            r10 = r0
        L8e:
            int r0 = r10 + 1
            int r9 = r9 + r3
            r10 = r4
            goto L46
        L93:
            int r0 = r0 + 1
            goto L46
        L96:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.tito.domain.GetActiveTitoTripsAndUpdateRestUseCase.b(java.util.List, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
