package app.chalo.validation.superpass;

import app.chalo.constants.Source;
import app.chalo.constants.SourceKt;
import app.chalo.data.BookingsRequestType;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.legacy.Product;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validation/superpass/SuperPassValidationNavigationManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationNavigationManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassValidationNavigationManager implements ProductValidationNavigationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloNavigationManager f10467a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10468a;

        static {
            int[] iArr = new int[SuperPassSubType.values().length];
            try {
                iArr[SuperPassSubType.MAGIC_SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassSubType.RIDE_BASED_SUPER_PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10468a = iArr;
        }
    }

    public SuperPassValidationNavigationManager(ChaloNavigationManager chaloNavigationManager) {
        this.f10467a = chaloNavigationManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager
    public final Object d(ProductValidationData productValidationData, String str, String str2, Long l, boolean z, Continuation continuation) {
        SuperPassValidationNavigationManager$onViewTripReceipt$1 superPassValidationNavigationManager$onViewTripReceipt$1;
        String str3;
        if (continuation instanceof SuperPassValidationNavigationManager$onViewTripReceipt$1) {
            superPassValidationNavigationManager$onViewTripReceipt$1 = (SuperPassValidationNavigationManager$onViewTripReceipt$1) continuation;
            int i = superPassValidationNavigationManager$onViewTripReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                superPassValidationNavigationManager$onViewTripReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                superPassValidationNavigationManager$onViewTripReceipt$1 = new SuperPassValidationNavigationManager$onViewTripReceipt$1(this, (ContinuationImpl) continuation);
            }
        } else {
            superPassValidationNavigationManager$onViewTripReceipt$1 = new SuperPassValidationNavigationManager$onViewTripReceipt$1(this, (ContinuationImpl) continuation);
        }
        Object obj = superPassValidationNavigationManager$onViewTripReceipt$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassValidationNavigationManager$onViewTripReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String id = productValidationData.getId();
            superPassValidationNavigationManager$onViewTripReceipt$1.L$0 = str;
            superPassValidationNavigationManager$onViewTripReceipt$1.L$1 = l;
            superPassValidationNavigationManager$onViewTripReceipt$1.L$2 = id;
            superPassValidationNavigationManager$onViewTripReceipt$1.Z$0 = z;
            superPassValidationNavigationManager$onViewTripReceipt$1.label = 1;
            Object objX = productValidationData.x(superPassValidationNavigationManager$onViewTripReceipt$1);
            if (objX == obj2) {
                return obj2;
            }
            str3 = id;
            obj = objX;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = superPassValidationNavigationManager$onViewTripReceipt$1.Z$0;
            String str4 = (String) superPassValidationNavigationManager$onViewTripReceipt$1.L$2;
            l = (Long) superPassValidationNavigationManager$onViewTripReceipt$1.L$1;
            str = (String) superPassValidationNavigationManager$onViewTripReceipt$1.L$0;
            ResultKt.b(obj);
            str3 = str4;
        }
        BookingsRequestType.SuperPassRideType superPassRideType = new BookingsRequestType.SuperPassRideType(str3, ((Number) obj).longValue() / ((long) 1000), l != null ? l.longValue() : -1L);
        Source sourceA = SourceKt.a(str);
        if (sourceA == null) {
            sourceA = Source.BLE_VALIDATION_ACTIVITY;
        }
        TripSummaryArgs.TicketSummaryScreen ticketSummaryScreen = new TripSummaryArgs.TicketSummaryScreen(sourceA, superPassRideType);
        ChaloNavigationManager chaloNavigationManager = this.f10467a;
        if (z) {
            ChaloNavigationManagerKt.b(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7), ticketSummaryScreen);
        } else {
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(ticketSummaryScreen, null, null, 6));
        }
        return Unit.f17538a;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager
    public final Object e(Product product, String str, PopUpToConfig.Finish finish, Continuation continuation) {
        BookingsRequestType magicPassType;
        SuperPassSubType.Companion companion = SuperPassSubType.INSTANCE;
        String str2 = product.c;
        String str3 = product.f10666a;
        companion.getClass();
        int i = WhenMappings.f10468a[SuperPassSubType.Companion.a(str2).ordinal()];
        if (i == 1) {
            magicPassType = new BookingsRequestType.MagicPassType(str3);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            magicPassType = new BookingsRequestType.RideBasedPassType(str3);
        }
        Source sourceA = SourceKt.a(str);
        if (sourceA == null) {
            sourceA = Source.BLE_VALIDATION_ACTIVITY;
        }
        this.f10467a.b(new ChaloNavigationRequest.Navigate(new TripSummaryArgs.PassSummaryScreen(sourceA, magicPassType), new ChaloNavOptions(finish, 3), null, 4));
        return Unit.f17538a;
    }
}
