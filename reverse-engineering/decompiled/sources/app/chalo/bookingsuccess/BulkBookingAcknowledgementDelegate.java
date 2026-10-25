package app.chalo.bookingsuccess;

import androidx.compose.ui.unit.Dp;
import app.chalo.bookingsuccess.BulkBookingAcknowledgementDelegate;
import app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData;
import app.chalo.compose.theme.UIShape;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.domain.BulkPreBookUseCase;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.BookingSuccessArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.PbBulkBookingRideDetailsArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.success.StandardSuccessScreenUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/bookingsuccess/BulkBookingAcknowledgementDelegate;", "Lapp/chalo/bookingsuccess/BookingSuccessFlowDelegate;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BulkBookingAcknowledgementDelegate implements BookingSuccessFlowDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookingSuccessArgs.BulkBooking f1154a;
    public final StringProvider b;
    public final ChaloNavigationManager c;
    public final BulkPreBookUseCase d;
    public final MutableStateFlow e;
    public BulkBookingAcknowledgementData f;
    public final StateFlow g;

    public BulkBookingAcknowledgementDelegate(BookingSuccessArgs.BulkBooking bulkBooking, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, BulkPreBookUseCase bulkPreBookUseCase) {
        this.f1154a = bulkBooking;
        this.b = stringProvider;
        this.c = chaloNavigationManager;
        this.d = bulkPreBookUseCase;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new BookingSuccessDataState(bulkBooking, bulkBooking.b, 9));
        this.e = mutableStateFlowA;
        this.g = FlowKt.c(mutableStateFlowA);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ea A[PHI: r1 r2
      0x00ea: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:30:0x00e6, B:22:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r2v14 java.lang.Object) = (r2v13 java.lang.Object), (r2v1 java.lang.Object) binds: [B:30:0x00e6, B:22:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:39:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157 A[PHI: r1 r2
      0x0157: PHI (r1v16 java.lang.String) = (r1v15 java.lang.String), (r1v19 java.lang.String) binds: [B:47:0x0153, B:18:0x0086] A[DONT_GENERATE, DONT_INLINE]
      0x0157: PHI (r2v24 java.lang.Object) = (r2v23 java.lang.Object), (r2v1 java.lang.Object) binds: [B:47:0x0153, B:18:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x016c  */
    /* JADX WARN: Code duplicated, block: B:56:0x018a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d8 A[PHI: r1 r2
      0x01d8: PHI (r1v33 java.lang.String) = (r1v27 java.lang.String), (r1v35 java.lang.String) binds: [B:64:0x01b9, B:69:0x01d1] A[DONT_GENERATE, DONT_INLINE]
      0x01d8: PHI (r2v34 java.lang.String) = (r2v32 java.lang.String), (r2v38 java.lang.String) binds: [B:64:0x01b9, B:69:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0207  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object f(BulkBookingAcknowledgementDelegate bulkBookingAcknowledgementDelegate, BulkBookingAcknowledgementData bulkBookingAcknowledgementData, ContinuationImpl continuationImpl) {
        BulkBookingAcknowledgementDelegate$createAndUpdateDataState$1 bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1;
        BookingSuccessScreenDetail bookingSuccessScreenDetail;
        String str;
        String str2;
        Object objB;
        String str3;
        String str4;
        String str5;
        Object objB2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Object objB3;
        String str11;
        String str12;
        String str13;
        Object objB4;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        Object objB5;
        String str19;
        Object objB6;
        String str20;
        String str21;
        Object objB7;
        String str22;
        String str23;
        String str24;
        MutableStateFlow mutableStateFlow;
        Object value;
        BulkBookingAcknowledgementData bulkBookingAcknowledgementData2 = bulkBookingAcknowledgementData;
        StringProvider stringProvider = bulkBookingAcknowledgementDelegate.b;
        if (continuationImpl instanceof BulkBookingAcknowledgementDelegate$createAndUpdateDataState$1) {
            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1 = (BulkBookingAcknowledgementDelegate$createAndUpdateDataState$1) continuationImpl;
            int i = bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = i - Integer.MIN_VALUE;
            } else {
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1 = new BulkBookingAcknowledgementDelegate$createAndUpdateDataState$1(bulkBookingAcknowledgementDelegate, continuationImpl);
            }
        } else {
            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1 = new BulkBookingAcknowledgementDelegate$createAndUpdateDataState$1(bulkBookingAcknowledgementDelegate, continuationImpl);
        }
        Object objB8 = bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label) {
            case 0:
                ResultKt.b(objB8);
                if (bulkBookingAcknowledgementData2 instanceof BulkBookingAcknowledgementData.BookingSuccess) {
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 1;
                    objB8 = stringProvider.b(StringEnum.BOOKINGS_RECEIVED, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                    if (objB8 != coroutineSingletons) {
                        str = (String) objB8;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 2;
                        objB8 = stringProvider.b(StringEnum.YOUR_RIDE_WILL_BE_CONFIRMED_SHORTLY_TAP_ON_VIEW_RIDES_TO_TRACK_UPDATES, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                        if (objB8 != coroutineSingletons) {
                            str2 = (String) objB8;
                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str;
                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str2;
                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 3;
                            objB = stringProvider.b(StringEnum.VIEW_RIDES, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                            if (objB != coroutineSingletons) {
                                str3 = str;
                                str4 = str2;
                                objB8 = objB;
                                str5 = (String) objB8;
                                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str3;
                                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str4;
                                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str5;
                                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 4;
                                objB2 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                                if (objB2 != coroutineSingletons) {
                                    str6 = str4;
                                    str7 = str5;
                                    objB8 = objB2;
                                    str8 = str3;
                                    bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str8, str6, null, null, LottieType.NEW_PAYMENT_SUCCESS, str7, (String) objB8, 44);
                                    mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                                    do {
                                        value = mutableStateFlow.getValue();
                                    } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                                    return Unit.f17538a;
                                }
                            }
                        }
                    }
                } else {
                    if (!(bulkBookingAcknowledgementData2 instanceof BulkBookingAcknowledgementData.BookingFailed)) {
                        if (bulkBookingAcknowledgementData2 instanceof BulkBookingAcknowledgementData.OverlappingBookingFailure) {
                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = bulkBookingAcknowledgementData2;
                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 9;
                            objB8 = stringProvider.b(StringEnum.YOU_HAVE_AN_OVERLAPPING_BOOKING, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                            if (objB8 != coroutineSingletons) {
                                str17 = (String) objB8;
                                str18 = ((BulkBookingAcknowledgementData.OverlappingBookingFailure) bulkBookingAcknowledgementData2).b;
                                if (str18 == null) {
                                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str17;
                                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 10;
                                    objB5 = stringProvider.b(StringEnum.OVERLAPPING_BOOKING_ERROR_MESSAGE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                                    if (objB5 != coroutineSingletons) {
                                        objB8 = objB5;
                                        str19 = str17;
                                        String str25 = (String) objB8;
                                        str17 = str19;
                                        str18 = str25;
                                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str17;
                                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str18;
                                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 11;
                                        objB6 = stringProvider.b(StringEnum.VIEW_BOOKED_RIDES, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                                        if (objB6 != coroutineSingletons) {
                                            str20 = str17;
                                            objB8 = objB6;
                                            str21 = (String) objB8;
                                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str20;
                                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str18;
                                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str21;
                                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 12;
                                            objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                                            if (objB7 != coroutineSingletons) {
                                                str22 = str18;
                                                str23 = str21;
                                                objB8 = objB7;
                                                str24 = str20;
                                                bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str24, str22, null, null, LottieType.NEW_ERROR, str23, (String) objB8, 300);
                                            }
                                        }
                                    }
                                } else {
                                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str17;
                                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str18;
                                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 11;
                                    objB6 = stringProvider.b(StringEnum.VIEW_BOOKED_RIDES, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                                    if (objB6 != coroutineSingletons) {
                                        str20 = str17;
                                        objB8 = objB6;
                                        str21 = (String) objB8;
                                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str20;
                                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str18;
                                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str21;
                                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 12;
                                        objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                                        if (objB7 != coroutineSingletons) {
                                            str22 = str18;
                                            str23 = str21;
                                            objB8 = objB7;
                                            str24 = str20;
                                            bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str24, str22, null, null, LottieType.NEW_ERROR, str23, (String) objB8, 300);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (bulkBookingAcknowledgementData2 != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bookingSuccessScreenDetail = null;
                        }
                        mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                        return Unit.f17538a;
                    }
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 5;
                    objB8 = stringProvider.b(StringEnum.BOOKING_FAILED, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                    if (objB8 != coroutineSingletons) {
                        str9 = (String) objB8;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str9;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 6;
                        objB8 = stringProvider.b(StringEnum.PLEASE_TRY_BOOKING_AGAIN, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                        if (objB8 != coroutineSingletons) {
                            str10 = (String) objB8;
                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str9;
                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str10;
                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 7;
                            objB3 = stringProvider.b(StringEnum.RETRY_BOOKING, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                            if (objB3 != coroutineSingletons) {
                                str11 = str9;
                                str12 = str10;
                                objB8 = objB3;
                                str13 = (String) objB8;
                                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str11;
                                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str12;
                                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str13;
                                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 8;
                                objB4 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                                if (objB4 != coroutineSingletons) {
                                    str14 = str12;
                                    str15 = str13;
                                    objB8 = objB4;
                                    str16 = str11;
                                    bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str16, str14, null, null, LottieType.NEW_ERROR, str15, (String) objB8, 300);
                                    mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                                    do {
                                        value = mutableStateFlow.getValue();
                                    } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                                    return Unit.f17538a;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                ResultKt.b(objB8);
                str = (String) objB8;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 2;
                objB8 = stringProvider.b(StringEnum.YOUR_RIDE_WILL_BE_CONFIRMED_SHORTLY_TAP_ON_VIEW_RIDES_TO_TRACK_UPDATES, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                if (objB8 != coroutineSingletons) {
                    str2 = (String) objB8;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str2;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 3;
                    objB = stringProvider.b(StringEnum.VIEW_RIDES, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                    if (objB != coroutineSingletons) {
                        str3 = str;
                        str4 = str2;
                        objB8 = objB;
                        str5 = (String) objB8;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str3;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str4;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str5;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                        if (objB2 != coroutineSingletons) {
                            str6 = str4;
                            str7 = str5;
                            objB8 = objB2;
                            str8 = str3;
                            bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str8, str6, null, null, LottieType.NEW_PAYMENT_SUCCESS, str7, (String) objB8, 44);
                            mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                            return Unit.f17538a;
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                str = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0;
                ResultKt.b(objB8);
                str2 = (String) objB8;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str2;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 3;
                objB = stringProvider.b(StringEnum.VIEW_RIDES, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                if (objB != coroutineSingletons) {
                    str3 = str;
                    str4 = str2;
                    objB8 = objB;
                    str5 = (String) objB8;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str3;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str4;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str5;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                    if (objB2 != coroutineSingletons) {
                        str6 = str4;
                        str7 = str5;
                        objB8 = objB2;
                        str8 = str3;
                        bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str8, str6, null, null, LottieType.NEW_PAYMENT_SUCCESS, str7, (String) objB8, 44);
                        mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 3:
                str4 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1;
                str3 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0;
                ResultKt.b(objB8);
                str5 = (String) objB8;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str3;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str4;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str5;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                if (objB2 != coroutineSingletons) {
                    str6 = str4;
                    str7 = str5;
                    objB8 = objB2;
                    str8 = str3;
                    bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str8, str6, null, null, LottieType.NEW_PAYMENT_SUCCESS, str7, (String) objB8, 44);
                    mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 4:
                String str26 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2;
                String str27 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1;
                String str28 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0;
                ResultKt.b(objB8);
                str7 = str26;
                str6 = str27;
                str8 = str28;
                bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str8, str6, null, null, LottieType.NEW_PAYMENT_SUCCESS, str7, (String) objB8, 44);
                mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                return Unit.f17538a;
            case 5:
                ResultKt.b(objB8);
                str9 = (String) objB8;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str9;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 6;
                objB8 = stringProvider.b(StringEnum.PLEASE_TRY_BOOKING_AGAIN, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                if (objB8 != coroutineSingletons) {
                    str10 = (String) objB8;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str9;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str10;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 7;
                    objB3 = stringProvider.b(StringEnum.RETRY_BOOKING, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                    if (objB3 != coroutineSingletons) {
                        str11 = str9;
                        str12 = str10;
                        objB8 = objB3;
                        str13 = (String) objB8;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str11;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str12;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str13;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 8;
                        objB4 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                        if (objB4 != coroutineSingletons) {
                            str14 = str12;
                            str15 = str13;
                            objB8 = objB4;
                            str16 = str11;
                            bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str16, str14, null, null, LottieType.NEW_ERROR, str15, (String) objB8, 300);
                            mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                            return Unit.f17538a;
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                str9 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0;
                ResultKt.b(objB8);
                str10 = (String) objB8;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str9;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str10;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 7;
                objB3 = stringProvider.b(StringEnum.RETRY_BOOKING, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                if (objB3 != coroutineSingletons) {
                    str11 = str9;
                    str12 = str10;
                    objB8 = objB3;
                    str13 = (String) objB8;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str11;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str12;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str13;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 8;
                    objB4 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                    if (objB4 != coroutineSingletons) {
                        str14 = str12;
                        str15 = str13;
                        objB8 = objB4;
                        str16 = str11;
                        bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str16, str14, null, null, LottieType.NEW_ERROR, str15, (String) objB8, 300);
                        mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 7:
                str12 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1;
                str11 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0;
                ResultKt.b(objB8);
                str13 = (String) objB8;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str11;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str12;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str13;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 8;
                objB4 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                if (objB4 != coroutineSingletons) {
                    str14 = str12;
                    str15 = str13;
                    objB8 = objB4;
                    str16 = str11;
                    bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str16, str14, null, null, LottieType.NEW_ERROR, str15, (String) objB8, 300);
                    mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 8:
                String str29 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2;
                String str30 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1;
                String str31 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0;
                ResultKt.b(objB8);
                str15 = str29;
                str14 = str30;
                str16 = str31;
                bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str16, str14, null, null, LottieType.NEW_ERROR, str15, (String) objB8, 300);
                mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                return Unit.f17538a;
            case 9:
                bulkBookingAcknowledgementData2 = (BulkBookingAcknowledgementData) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0;
                ResultKt.b(objB8);
                str17 = (String) objB8;
                str18 = ((BulkBookingAcknowledgementData.OverlappingBookingFailure) bulkBookingAcknowledgementData2).b;
                if (str18 == null) {
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str17;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 10;
                    objB5 = stringProvider.b(StringEnum.OVERLAPPING_BOOKING_ERROR_MESSAGE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                    if (objB5 != coroutineSingletons) {
                        objB8 = objB5;
                        str19 = str17;
                        String str210 = (String) objB8;
                        str17 = str19;
                        str18 = str210;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str17;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str18;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 11;
                        objB6 = stringProvider.b(StringEnum.VIEW_BOOKED_RIDES, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                        if (objB6 != coroutineSingletons) {
                            str20 = str17;
                            objB8 = objB6;
                            str21 = (String) objB8;
                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str20;
                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str18;
                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str21;
                            bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 12;
                            objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                            if (objB7 != coroutineSingletons) {
                                str22 = str18;
                                str23 = str21;
                                objB8 = objB7;
                                str24 = str20;
                                bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str24, str22, null, null, LottieType.NEW_ERROR, str23, (String) objB8, 300);
                                mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                                do {
                                    value = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                                return Unit.f17538a;
                            }
                        }
                    }
                } else {
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str17;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str18;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 11;
                    objB6 = stringProvider.b(StringEnum.VIEW_BOOKED_RIDES, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                    if (objB6 != coroutineSingletons) {
                        str20 = str17;
                        objB8 = objB6;
                        str21 = (String) objB8;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str20;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str18;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str21;
                        bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 12;
                        objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                        if (objB7 != coroutineSingletons) {
                            str22 = str18;
                            str23 = str21;
                            objB8 = objB7;
                            str24 = str20;
                            bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str24, str22, null, null, LottieType.NEW_ERROR, str23, (String) objB8, 300);
                            mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                            do {
                                value = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                            return Unit.f17538a;
                        }
                    }
                }
                return coroutineSingletons;
            case 10:
                str19 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0;
                ResultKt.b(objB8);
                String str211 = (String) objB8;
                str17 = str19;
                str18 = str211;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str17;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str18;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 11;
                objB6 = stringProvider.b(StringEnum.VIEW_BOOKED_RIDES, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                if (objB6 != coroutineSingletons) {
                    str20 = str17;
                    objB8 = objB6;
                    str21 = (String) objB8;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str20;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str18;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str21;
                    bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 12;
                    objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                    if (objB7 != coroutineSingletons) {
                        str22 = str18;
                        str23 = str21;
                        objB8 = objB7;
                        str24 = str20;
                        bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str24, str22, null, null, LottieType.NEW_ERROR, str23, (String) objB8, 300);
                        mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 11:
                str18 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1;
                str20 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0;
                ResultKt.b(objB8);
                str21 = (String) objB8;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0 = str20;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1 = str18;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2 = str21;
                bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.label = 12;
                objB7 = stringProvider.b(StringEnum.BACK_TO_HOMESCREEN_CAMEL_CASE, new Object[0], bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1);
                if (objB7 != coroutineSingletons) {
                    str22 = str18;
                    str23 = str21;
                    objB8 = objB7;
                    str24 = str20;
                    bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str24, str22, null, null, LottieType.NEW_ERROR, str23, (String) objB8, 300);
                    mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 12:
                String str32 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$2;
                String str33 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$1;
                String str34 = (String) bulkBookingAcknowledgementDelegate$createAndUpdateDataState$1.L$0;
                ResultKt.b(objB8);
                str23 = str32;
                str22 = str33;
                str24 = str34;
                bookingSuccessScreenDetail = new BookingSuccessScreenDetail(str24, str22, null, null, LottieType.NEW_ERROR, str23, (String) objB8, 300);
                mutableStateFlow = bulkBookingAcknowledgementDelegate.e;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value, BookingSuccessDataState.a((BookingSuccessDataState) value, bookingSuccessScreenDetail, 14)));
                return Unit.f17538a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // app.chalo.bookingsuccess.BookingSuccessFlowDelegate
    public final BookingSuccessViewState a(final ContextScope contextScope, BookingSuccessDataState bookingSuccessDataState) {
        TextUIState.ChaloTextUIState chaloTextUIState;
        GifImageUIState gifImageUIState;
        ButtonUIState buttonUIStateF;
        BookingSuccessScreenDetail bookingSuccessScreenDetail = bookingSuccessDataState.f1149a;
        StandardSuccessScreenUIState.SuccessWithGifMsgAndCta successWithGifMsgAndCta = null;
        ButtonUIState buttonUIStateD = null;
        if (bookingSuccessScreenDetail != null) {
            String str = bookingSuccessScreenDetail.f1152a;
            UITextStyle uITextStyle = UITextStyle.DisplaySmall;
            UIFontWeight uIFontWeight = UIFontWeight.Bold;
            UITextAlign uITextAlign = UITextAlign.Center;
            TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(str, uITextStyle, (ChaloColorToken) ChaloColorToken.AlmostBlackColor.f9756a, 0, uITextAlign, uIFontWeight, (Integer) 24, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7960);
            String str2 = bookingSuccessScreenDetail.b;
            if (str2 != null) {
                chaloTextUIState = new TextUIState.ChaloTextUIState(str2, UITextStyle.BodyMedium, ChaloColorToken.ShadyGray.f9851a, 0, uITextAlign, UIFontWeight.Normal, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8088);
            } else {
                chaloTextUIState = null;
            }
            GifImageUIState gifImageUIState2 = bookingSuccessScreenDetail.h ? new GifImageUIState(LottieType.PASS_SUCCESS_CONFETTI, (ImageUISize) null, 4) : null;
            LottieType lottieType = bookingSuccessScreenDetail.e;
            if (lottieType != null) {
                float f = 200;
                gifImageUIState = new GifImageUIState(lottieType, 1, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(f)), Dp.m7276boximpl(Dp.m7278constructorimpl(f))));
            } else {
                float f2 = 200;
                gifImageUIState = new GifImageUIState(LottieType.NEW_PAYMENT_SUCCESS, 1, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(f2)), Dp.m7276boximpl(Dp.m7278constructorimpl(f2))));
            }
            GifImageUIState gifImageUIState3 = gifImageUIState;
            String str3 = bookingSuccessScreenDetail.f;
            ButtonUIStateFactory buttonUIStateFactory = ButtonUIStateFactory.f9921a;
            if (str3 != null) {
                final int i = 0;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory, new TextUIState.ChaloTextUIState(str3, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new Function0(this) { // from class: ed
                    public final /* synthetic */ BulkBookingAcknowledgementDelegate b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                this.b.e(contextScope);
                                break;
                            default:
                                this.b.d(contextScope);
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, UIShape.e, false, 0.0f, 52);
            } else {
                buttonUIStateF = null;
            }
            String str4 = bookingSuccessScreenDetail.g;
            if (str4 != null) {
                final int i2 = 1;
                buttonUIStateD = ButtonUIStateFactory.d(buttonUIStateFactory, new TextUIState.ChaloTextUIState(str4, UITextStyle.HeadlineSmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new Function0(this) { // from class: ed
                    public final /* synthetic */ BulkBookingAcknowledgementDelegate b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                this.b.e(contextScope);
                                break;
                            default:
                                this.b.d(contextScope);
                                break;
                        }
                        return Unit.f17538a;
                    }
                }, UIShape.e, false, 52);
            }
            successWithGifMsgAndCta = new StandardSuccessScreenUIState.SuccessWithGifMsgAndCta(gifImageUIState3, gifImageUIState2, chaloTextUIState2, chaloTextUIState, null, null, buttonUIStateF, buttonUIStateD, 97);
        }
        return new BookingSuccessViewState(successWithGifMsgAndCta);
    }

    @Override // app.chalo.bookingsuccess.BookingSuccessFlowDelegate
    public final void b(ContextScope coroutineScope) {
        Intrinsics.i(coroutineScope, "coroutineScope");
        BulkBookingAcknowledgementData bulkBookingAcknowledgementData = this.f;
        if (!(bulkBookingAcknowledgementData instanceof BulkBookingAcknowledgementData.BookingFailed) && !(bulkBookingAcknowledgementData instanceof BulkBookingAcknowledgementData.BookingSuccess) && !(bulkBookingAcknowledgementData instanceof BulkBookingAcknowledgementData.OverlappingBookingFailure) && bulkBookingAcknowledgementData != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.bookingsuccess.BookingSuccessFlowDelegate
    public final void c(ContextScope coroutineScope) {
        Object objB;
        Intrinsics.i(coroutineScope, "coroutineScope");
        ChaloJson chaloJson = ChaloJson.f6455a;
        String str = this.f1154a.e;
        try {
            Json json = ChaloJson.b;
            json.getClass();
            objB = json.b(str, BulkBookingAcknowledgementData.INSTANCE.serializer());
        } catch (Exception unused) {
            objB = null;
        }
        BulkBookingAcknowledgementData bulkBookingAcknowledgementData = (BulkBookingAcknowledgementData) objB;
        this.f = bulkBookingAcknowledgementData;
        if (bulkBookingAcknowledgementData != null) {
            BuildersKt.d(coroutineScope, null, null, new BulkBookingAcknowledgementDelegate$initialize$1(this, null), 3);
            return;
        }
        ChaloNavigationManagerKt.e(this.c, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
    }

    @Override // app.chalo.bookingsuccess.BookingSuccessFlowDelegate
    public final void d(CoroutineScope coroutineScope) {
        Intrinsics.i(coroutineScope, "coroutineScope");
        BulkBookingAcknowledgementData bulkBookingAcknowledgementData = this.f;
        if (!(bulkBookingAcknowledgementData instanceof BulkBookingAcknowledgementData.BookingSuccess) && !(bulkBookingAcknowledgementData instanceof BulkBookingAcknowledgementData.BookingFailed) && !(bulkBookingAcknowledgementData instanceof BulkBookingAcknowledgementData.OverlappingBookingFailure) && bulkBookingAcknowledgementData != null) {
            throw new NoWhenBranchMatchedException();
        }
        ChaloNavigationManagerKt.e(this.c, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
    }

    @Override // app.chalo.bookingsuccess.BookingSuccessFlowDelegate
    public final void e(CoroutineScope coroutineScope) {
        Intrinsics.i(coroutineScope, "coroutineScope");
        BulkBookingAcknowledgementData bulkBookingAcknowledgementData = this.f;
        boolean z = bulkBookingAcknowledgementData instanceof BulkBookingAcknowledgementData.BookingSuccess;
        ChaloNavigationManager chaloNavigationManager = this.c;
        if (z) {
            BulkBookingAcknowledgementData.BookingSuccess bookingSuccess = (BulkBookingAcknowledgementData.BookingSuccess) bulkBookingAcknowledgementData;
            ChaloNavigationManagerKt.b(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7), new PbBulkBookingRideDetailsArgs(bookingSuccess.e, bookingSuccess.c, bookingSuccess.b, bookingSuccess.d));
        } else if (bulkBookingAcknowledgementData instanceof BulkBookingAcknowledgementData.BookingFailed) {
            BuildersKt.d(coroutineScope, null, null, new BulkBookingAcknowledgementDelegate$onPositiveClick$1(this, coroutineScope, bulkBookingAcknowledgementData, null), 3);
        } else if (bulkBookingAcknowledgementData instanceof BulkBookingAcknowledgementData.OverlappingBookingFailure) {
            BulkBookingAcknowledgementData.OverlappingBookingFailure overlappingBookingFailure = (BulkBookingAcknowledgementData.OverlappingBookingFailure) bulkBookingAcknowledgementData;
            ChaloNavigationManagerKt.b(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7), new PbBulkBookingRideDetailsArgs(overlappingBookingFailure.f, overlappingBookingFailure.d, overlappingBookingFailure.c, overlappingBookingFailure.e));
        } else if (bulkBookingAcknowledgementData != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.bookingsuccess.BookingSuccessFlowDelegate
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final StateFlow getG() {
        return this.g;
    }
}
