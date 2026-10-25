package app.chalo.productpurchase.productselection.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.GroupTicketConfigEligibilityHelper;
import app.chalo.contract.GroupTicketConfigMatch;
import app.chalo.contract.GroupTicketEligibleSubProduct;
import app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModelKt;
import app.chalo.productpurchase.productselection.data.models.app.EligibleSubProductAppModel;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/domain/GroupTicketConfigEligibilityHelperImpl;", "Lapp/chalo/contract/GroupTicketConfigEligibilityHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupTicketConfigEligibilityHelperImpl implements GroupTicketConfigEligibilityHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductPurchaseRepository f8658a;
    public final FetchProductConfigsUseCase b;
    public final BasicInfoContract c;

    public GroupTicketConfigEligibilityHelperImpl(ProductPurchaseRepository productPurchaseRepository, FetchProductConfigsUseCase fetchProductConfigsUseCase, BasicInfoContract basicInfoContract) {
        this.f8658a = productPurchaseRepository;
        this.b = fetchProductConfigsUseCase;
        this.c = basicInfoContract;
    }

    public static GroupTicketConfigMatch b(List list, Set set, int i) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj3 = arrayList.get(i3);
            i3++;
            ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel groupTicketConfigResponseAppModel = (ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) obj3;
            if (groupTicketConfigResponseAppModel.n && groupTicketConfigResponseAppModel.o && AllProductConfigsResponseAppModelKt.h(groupTicketConfigResponseAppModel, i)) {
                arrayList2.add(obj3);
            }
        }
        int size2 = arrayList2.size();
        int i4 = 0;
        loop2: while (true) {
            if (i4 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList2.get(i4);
            i4++;
            List list2 = ((ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) obj).x;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((EligibleSubProductAppModel) it.next()).b);
            }
            Set setG0 = CollectionsKt.G0(arrayList3);
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                do {
                    if (!it2.hasNext()) {
                        break loop2;
                    }
                } while (setG0.contains((String) it2.next()));
            } else {
                break;
            }
        }
        ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel groupTicketConfigResponseAppModel2 = (ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) obj;
        if (groupTicketConfigResponseAppModel2 == null) {
            return null;
        }
        String str = groupTicketConfigResponseAppModel2.j;
        List list3 = groupTicketConfigResponseAppModel2.x;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list3) {
            if (set.contains(((EligibleSubProductAppModel) obj4).b)) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.v(arrayList4, 10));
        int size3 = arrayList4.size();
        while (i2 < size3) {
            Object obj5 = arrayList4.get(i2);
            i2++;
            EligibleSubProductAppModel eligibleSubProductAppModel = (EligibleSubProductAppModel) obj5;
            arrayList5.add(new GroupTicketEligibleSubProduct(eligibleSubProductAppModel.b, eligibleSubProductAppModel.c));
        }
        return new GroupTicketConfigMatch(str, arrayList5);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.contract.GroupTicketConfigEligibilityHelper
    public final Object a(Set set, ContinuationImpl continuationImpl) {
        GroupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1 groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1;
        int iH;
        Object objE;
        Set set2;
        int i;
        ProductFetchResult productFetchResult;
        if (continuationImpl instanceof GroupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1) {
            groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1 = (GroupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1) continuationImpl;
            int i2 = groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.label = i2 - Integer.MIN_VALUE;
            } else {
                groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1 = new GroupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1(this, continuationImpl);
            }
        } else {
            groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1 = new GroupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1(this, continuationImpl);
        }
        Object obj = groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            if (set.isEmpty()) {
                return null;
            }
            iH = this.c.h();
            groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.L$0 = set;
            groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.I$0 = iH;
            groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.label = 1;
            objE = this.f8658a.e(groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1);
            if (objE != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            int i4 = groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.I$0;
            Set set3 = (Set) groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.L$0;
            ResultKt.b(obj);
            iH = i4;
            set = set3;
            objE = obj;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.I$0;
            set2 = (Set) groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.L$0;
            ResultKt.b(obj);
        }
        productFetchResult = (ProductFetchResult) obj;
        if (productFetchResult instanceof ProductFetchResult.Success) {
            return b(((ProductFetchResult.Success) productFetchResult).f8663a.f8629a, set2, i);
        }
        if (!(productFetchResult instanceof ProductFetchResult.FetchFailed) || (productFetchResult instanceof ProductFetchResult.InvalidCity) || (productFetchResult instanceof ProductFetchResult.InvalidResponse) || (productFetchResult instanceof ProductFetchResult.UnknownError)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
        List list = (List) objE;
        if (list == null) {
            list = EmptyList.f17557a;
        }
        GroupTicketConfigMatch groupTicketConfigMatchB = b(list, set, iH);
        if (groupTicketConfigMatchB != null) {
            return groupTicketConfigMatchB;
        }
        groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.L$0 = set;
        groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.I$0 = iH;
        groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1.label = 2;
        Object objA = this.b.a(groupTicketConfigEligibilityHelperImpl$getGroupTicketConfigMatchForProductSubTypes$1);
        if (objA != coroutineSingletons) {
            set2 = set;
            i = iH;
            obj = objA;
            productFetchResult = (ProductFetchResult) obj;
            if (productFetchResult instanceof ProductFetchResult.Success) {
                return b(((ProductFetchResult.Success) productFetchResult).f8663a.f8629a, set2, i);
            }
            return productFetchResult instanceof ProductFetchResult.FetchFailed ? null : null;
        }
        return coroutineSingletons;
    }
}
