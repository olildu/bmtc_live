package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.livetracking.routedetails.domain.LivePassengerIndicatorBottomSheetDetailsType;
import app.chalo.livetracking.ui.routedetailsscreen.SeatAvlNoticeTextUIState;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.q70;
import defpackage.w60;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/LivePassengerIndicatorUIStateFactory;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LivePassengerIndicatorUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f4912a;

    public LivePassengerIndicatorUIStateFactory(StringProvider stringProvider) {
        this.f4912a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0132  */
    /* JADX WARN: Code duplicated, block: B:51:0x014e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        if (r3 == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e9, code lost:
    
        if (r3 == r5) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.livetracking.routedetails.domain.LivePassengerIndicatorBottomSheetDetails r26, kotlin.jvm.functions.Function1 r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.LivePassengerIndicatorUIStateFactory.a(app.chalo.livetracking.routedetails.domain.LivePassengerIndicatorBottomSheetDetails, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, ContinuationImpl continuationImpl, Function1 function1) {
        LivePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1 livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1;
        ButtonUIState[] buttonUIStateArr;
        Function1 function2;
        ButtonUIStateFactory buttonUIStateFactory;
        int i;
        String str2;
        ButtonUIState[] buttonUIStateArr2;
        List list;
        List list2;
        Function1 function3;
        String str3;
        if (continuationImpl instanceof LivePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1) {
            livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1 = (LivePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1) continuationImpl;
            int i2 = livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.label = i2 - Integer.MIN_VALUE;
            } else {
                livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1 = new LivePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1(this, continuationImpl);
            }
        } else {
            livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1 = new LivePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1(this, continuationImpl);
        }
        Object objB = livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.label;
        StringProvider stringProvider = this.f4912a;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        if (i3 == 0) {
            ResultKt.b(objB);
            buttonUIStateArr = new ButtonUIState[1];
            livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$0 = str;
            function2 = function1;
            livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$1 = function2;
            livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$2 = buttonUIStateArr;
            livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$3 = buttonUIStateArr;
            livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$4 = buttonUIStateFactory2;
            livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.I$0 = 0;
            livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.label = 1;
            objB = stringProvider.b(StringEnum.GOT_IT, new Object[0], livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1);
            if (objB != coroutineSingletons) {
                buttonUIStateFactory = buttonUIStateFactory2;
                i = 0;
                str2 = str;
                buttonUIStateArr2 = buttonUIStateArr;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.I$0;
            ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$4;
            buttonUIStateArr = (ButtonUIState[]) livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$3;
            buttonUIStateArr2 = (ButtonUIState[]) livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$2;
            function2 = (Function1) livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$1;
            str2 = (String) livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$0;
            ResultKt.b(objB);
            buttonUIStateFactory = buttonUIStateFactory3;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$4;
            buttonUIStateFactory2 = (ButtonUIStateFactory) livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$3;
            str3 = (String) livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$2;
            list2 = (List) livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$1;
            function3 = (Function1) livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$0;
            ResultKt.b(objB);
        }
        list.add(ButtonUIStateFactory.b(buttonUIStateFactory2, (String) objB, new w60(1, str3, function3), null, false, 60));
        return list2;
        buttonUIStateArr[i] = ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, new q70(function2, 22), null, null, false, 0.0f, 60);
        ArrayList arrayListB0 = CollectionsKt.b0(buttonUIStateArr2);
        if (str2 == null) {
            return arrayListB0;
        }
        livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$0 = function2;
        livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$1 = arrayListB0;
        livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$2 = str2;
        livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$3 = buttonUIStateFactory2;
        livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.L$4 = arrayListB0;
        livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.LEARN_MORE_CAPS, new Object[0], livePassengerIndicatorUIStateFactory$seatAvailabilityBottomCtas$1);
        if (objB2 != coroutineSingletons) {
            list = arrayListB0;
            list2 = list;
            objB = objB2;
            function3 = function2;
            str3 = str2;
            list.add(ButtonUIStateFactory.b(buttonUIStateFactory2, (String) objB, new w60(1, str3, function3), null, false, 60));
            return list2;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r15 == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        if (r15 == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d9, code lost:
    
        if (r15 == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
    
        if (r15 == r1) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.livetracking.routedetails.domain.LivePassengerIndicatorBottomSheetDetailsType r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.LivePassengerIndicatorUIStateFactory.c(app.chalo.livetracking.routedetails.domain.LivePassengerIndicatorBottomSheetDetailsType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(LivePassengerIndicatorBottomSheetDetailsType livePassengerIndicatorBottomSheetDetailsType, ContinuationImpl continuationImpl) {
        LivePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1 livePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1;
        LivePassengerIndicatorBottomSheetDetailsType livePassengerIndicatorBottomSheetDetailsType2 = livePassengerIndicatorBottomSheetDetailsType;
        if (continuationImpl instanceof LivePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1) {
            livePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1 = (LivePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1) continuationImpl;
            int i = livePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                livePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1.label = i - Integer.MIN_VALUE;
            } else {
                livePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1 = new LivePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1(this, continuationImpl);
            }
        } else {
            livePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1 = new LivePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1(this, continuationImpl);
        }
        Object objB = livePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = livePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!(livePassengerIndicatorBottomSheetDetailsType2 instanceof LivePassengerIndicatorBottomSheetDetailsType.WithNotice)) {
                if (Intrinsics.d(livePassengerIndicatorBottomSheetDetailsType2, LivePassengerIndicatorBottomSheetDetailsType.Default.f4441a) || Intrinsics.d(livePassengerIndicatorBottomSheetDetailsType2, LivePassengerIndicatorBottomSheetDetailsType.WithoutNotice.f4443a)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            livePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1.L$0 = livePassengerIndicatorBottomSheetDetailsType2;
            livePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1.label = 1;
            objB = this.f4912a.b(StringEnum.SEAT_OCCUPANCY_LEVEL_NOTICE_HEADER, new Object[0], livePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            livePassengerIndicatorBottomSheetDetailsType2 = (LivePassengerIndicatorBottomSheetDetailsType) livePassengerIndicatorUIStateFactory$seatAvailabilityNoticeText$1.L$0;
            ResultKt.b(objB);
        }
        return new SeatAvlNoticeTextUIState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.HeadlineMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), new TextUIState.ChaloTextUIState(((LivePassengerIndicatorBottomSheetDetailsType.WithNotice) livePassengerIndicatorBottomSheetDetailsType2).f4442a, UITextStyle.BodyLarge, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188));
    }
}
