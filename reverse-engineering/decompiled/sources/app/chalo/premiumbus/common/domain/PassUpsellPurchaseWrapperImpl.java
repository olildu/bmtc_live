package app.chalo.premiumbus.common.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.premiumbus.data.PassUpsellPurchaseWrapper;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.productpurchase.passpurchase.domain.CreateSuperPassOrderUseCase;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.productpurchase.utils.BookingHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.userprofile.Gender;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/common/domain/PassUpsellPurchaseWrapperImpl;", "Lapp/chalo/premiumbus/data/PassUpsellPurchaseWrapper;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PassUpsellPurchaseWrapperImpl implements PassUpsellPurchaseWrapper {
    public static final SuperPassUserDetails h = new SuperPassUserDetails((String) null, (String) null, (String) null, Gender.NULL, (String) null, (String) null, (String) null, 247);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductPurchaseRepository f6941a;
    public final CreateSuperPassOrderUseCase b;
    public final FetchCompleteProductConfigByIdUseCase c;
    public final StoreCompleteProductConfigLocallyUseCase d;
    public final UserProfileDetailsProvider e;
    public final BasicInfoContract f;
    public final TimeUtilsContract g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/premiumbus/common/domain/PassUpsellPurchaseWrapperImpl$Companion;", "", "Lapp/chalo/superpass/data/models/entities/SuperPassUserDetails;", "EMPTY_USER_DETAILS", "Lapp/chalo/superpass/data/models/entities/SuperPassUserDetails;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PassUpsellPurchaseWrapperImpl(ProductPurchaseRepository productPurchaseRepository, BookingHelper bookingHelper, CreateSuperPassOrderUseCase createSuperPassOrderUseCase, FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, StoreCompleteProductConfigLocallyUseCase storeCompleteProductConfigLocallyUseCase, UserProfileDetailsProvider userProfileDetailsProvider, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract) {
        this.f6941a = productPurchaseRepository;
        this.b = createSuperPassOrderUseCase;
        this.c = fetchCompleteProductConfigByIdUseCase;
        this.d = storeCompleteProductConfigLocallyUseCase;
        this.e = userProfileDetailsProvider;
        this.f = basicInfoContract;
        this.g = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r15 == r0) goto L35;
     */
    @Override // app.chalo.premiumbus.data.PassUpsellPurchaseWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, int r13, app.chalo.models.productbooking.SuperPassPurchaseStopsInfo r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.common.domain.PassUpsellPurchaseWrapperImpl.a(java.lang.String, int, app.chalo.models.productbooking.SuperPassPurchaseStopsInfo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0104  */
    /* JADX WARN: Code duplicated, block: B:41:0x012d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0137  */
    /* JADX WARN: Code duplicated, block: B:47:0x0154  */
    /* JADX WARN: Code duplicated, block: B:50:0x016d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0171  */
    /* JADX WARN: Code duplicated, block: B:54:0x017d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0189  */
    /* JADX WARN: Code duplicated, block: B:57:0x018d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0197  */
    /* JADX WARN: Code duplicated, block: B:60:0x019b  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: No SSA var for result arg: (r2 I:??) from 0x0155: PHI (r2 I:??) = (r2v29 int) binds: [B:47:0x0154] A[DONT_GENERATE, DONT_INLINE, REMOVE]
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:100)
        	at jadx.core.dex.visitors.regions.TernaryMod.replaceWithTernary(TernaryMod.java:353)
        	at jadx.core.dex.visitors.regions.TernaryMod.processOneBranchTernary(TernaryMod.java:284)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:82)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // app.chalo.premiumbus.data.PassUpsellPurchaseWrapper
    public final java.lang.Object b(app.chalo.premiumbus.data.PassUpsellPurchaseOffer r21, app.chalo.models.productbooking.SuperPassPurchaseStopsInfo r22, java.lang.String r23, kotlin.coroutines.jvm.internal.ContinuationImpl r24) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.common.domain.PassUpsellPurchaseWrapperImpl.b(app.chalo.premiumbus.data.PassUpsellPurchaseOffer, app.chalo.models.productbooking.SuperPassPurchaseStopsInfo, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, int i, String str2, ContinuationImpl continuationImpl) {
        PassUpsellPurchaseWrapperImpl$resolveBookableConfig$1 passUpsellPurchaseWrapperImpl$resolveBookableConfig$1;
        BookableSuperPassConfiguration bookableSuperPassConfiguration;
        BookableSuperPassConfiguration bookableSuperPassConfiguration2;
        if (continuationImpl instanceof PassUpsellPurchaseWrapperImpl$resolveBookableConfig$1) {
            passUpsellPurchaseWrapperImpl$resolveBookableConfig$1 = (PassUpsellPurchaseWrapperImpl$resolveBookableConfig$1) continuationImpl;
            int i2 = passUpsellPurchaseWrapperImpl$resolveBookableConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passUpsellPurchaseWrapperImpl$resolveBookableConfig$1.label = i2 - Integer.MIN_VALUE;
            } else {
                passUpsellPurchaseWrapperImpl$resolveBookableConfig$1 = new PassUpsellPurchaseWrapperImpl$resolveBookableConfig$1(this, continuationImpl);
            }
        } else {
            passUpsellPurchaseWrapperImpl$resolveBookableConfig$1 = new PassUpsellPurchaseWrapperImpl$resolveBookableConfig$1(this, continuationImpl);
        }
        Object objH = passUpsellPurchaseWrapperImpl$resolveBookableConfig$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = passUpsellPurchaseWrapperImpl$resolveBookableConfig$1.label;
        if (i3 == 0) {
            ResultKt.b(objH);
            passUpsellPurchaseWrapperImpl$resolveBookableConfig$1.L$0 = str2;
            passUpsellPurchaseWrapperImpl$resolveBookableConfig$1.I$0 = i;
            passUpsellPurchaseWrapperImpl$resolveBookableConfig$1.label = 1;
            objH = this.f6941a.h(str, passUpsellPurchaseWrapperImpl$resolveBookableConfig$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = passUpsellPurchaseWrapperImpl$resolveBookableConfig$1.I$0;
            str2 = (String) passUpsellPurchaseWrapperImpl$resolveBookableConfig$1.L$0;
            ResultKt.b(objH);
        }
        ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel = objH instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel ? (ProductConfigResponseAppModel.SuperPassConfigAppModel) objH : null;
        if (superPassConfigAppModel != null) {
            HashMap mapC = BookingHelper.c(superPassConfigAppModel);
            if (str2 != null) {
                Map map = (Map) mapC.get(str2);
                if (map != null && (bookableSuperPassConfiguration2 = (BookableSuperPassConfiguration) map.get(new Integer(i))) != null && bookableSuperPassConfiguration2.c()) {
                    return bookableSuperPassConfiguration2;
                }
            } else {
                Iterator it = mapC.values().iterator();
                do {
                    if (!it.hasNext()) {
                        bookableSuperPassConfiguration = null;
                        break;
                    }
                    bookableSuperPassConfiguration = (BookableSuperPassConfiguration) ((Map) it.next()).get(new Integer(i));
                } while (bookableSuperPassConfiguration == null);
                if (bookableSuperPassConfiguration != null && bookableSuperPassConfiguration.c()) {
                    return bookableSuperPassConfiguration;
                }
            }
        }
        return null;
    }
}
