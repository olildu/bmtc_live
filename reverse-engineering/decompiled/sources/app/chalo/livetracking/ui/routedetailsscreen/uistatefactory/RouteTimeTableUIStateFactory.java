package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import app.chalo.livetracking.routedetails.data.model.ui.RouteTripTimingUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.TimeTableUiModel;
import app.chalo.livetracking.ui.routedetailsscreen.TimeTableSectionHeaderUIState;
import app.chalo.livetracking.ui.routedetailsscreen.TimeTableSectionsUIState;
import app.chalo.livetracking.ui.routedetailsscreen.TimeTableTimingUIState;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteTimeTableUIStateFactory;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteTimeTableUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f4941a;

    public RouteTimeTableUIStateFactory(StringProvider stringProvider) {
        this.f4941a = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x012c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(String str, String str2, String str3, String str4, boolean z, ContinuationImpl continuationImpl) {
        RouteTimeTableUIStateFactory$getTimeTableHeading$1 routeTimeTableUIStateFactory$getTimeTableHeading$1;
        String str5;
        String str6;
        boolean z2;
        char c;
        TextUIState.StyledTextUIState styledTextUIState;
        String str7;
        String str8;
        String str9;
        TextUIState.StyledTextUIState styledTextUIState2;
        boolean z3;
        if (continuationImpl instanceof RouteTimeTableUIStateFactory$getTimeTableHeading$1) {
            routeTimeTableUIStateFactory$getTimeTableHeading$1 = (RouteTimeTableUIStateFactory$getTimeTableHeading$1) continuationImpl;
            int i = routeTimeTableUIStateFactory$getTimeTableHeading$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeTimeTableUIStateFactory$getTimeTableHeading$1.label = i - Integer.MIN_VALUE;
            } else {
                routeTimeTableUIStateFactory$getTimeTableHeading$1 = new RouteTimeTableUIStateFactory$getTimeTableHeading$1(this, continuationImpl);
            }
        } else {
            routeTimeTableUIStateFactory$getTimeTableHeading$1 = new RouteTimeTableUIStateFactory$getTimeTableHeading$1(this, continuationImpl);
        }
        Object objB = routeTimeTableUIStateFactory$getTimeTableHeading$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeTimeTableUIStateFactory$getTimeTableHeading$1.label;
        StringProvider stringProvider = this.f4941a;
        TextUIState.StyledTextUIState styledTextUIState3 = null;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (str == null || str2 == null) {
                str5 = str3;
                str6 = str4;
                z2 = z;
                c = 0;
                styledTextUIState = null;
                if (str5 != null) {
                    StringEnum stringEnum = StringEnum.SCHEDULE_FIRST_LAST_BUS;
                    Object[] objArr = new Object[2];
                    objArr[c] = str5;
                    objArr[1] = str6;
                    routeTimeTableUIStateFactory$getTimeTableHeading$1.L$0 = styledTextUIState;
                    routeTimeTableUIStateFactory$getTimeTableHeading$1.L$1 = null;
                    routeTimeTableUIStateFactory$getTimeTableHeading$1.L$2 = null;
                    routeTimeTableUIStateFactory$getTimeTableHeading$1.Z$0 = z2;
                    routeTimeTableUIStateFactory$getTimeTableHeading$1.label = 3;
                    objB = stringProvider.b(stringEnum, objArr, routeTimeTableUIStateFactory$getTimeTableHeading$1);
                    if (objB != coroutineSingletons) {
                        styledTextUIState2 = styledTextUIState;
                        z3 = z2;
                        z2 = z3;
                        styledTextUIState = styledTextUIState2;
                        styledTextUIState3 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB, null, null, UITextStyle.BodySmall, null, null, null, 1014)), null, null, 30);
                    }
                }
                return new TimeTableSectionHeaderUIState(styledTextUIState, styledTextUIState3, z2);
            }
            routeTimeTableUIStateFactory$getTimeTableHeading$1.L$0 = str2;
            str5 = str3;
            routeTimeTableUIStateFactory$getTimeTableHeading$1.L$1 = str5;
            routeTimeTableUIStateFactory$getTimeTableHeading$1.L$2 = str4;
            z2 = z;
            routeTimeTableUIStateFactory$getTimeTableHeading$1.Z$0 = z2;
            routeTimeTableUIStateFactory$getTimeTableHeading$1.label = 1;
            objB = stringProvider.b(StringEnum.START_FROM_STOP, new Object[]{str}, routeTimeTableUIStateFactory$getTimeTableHeading$1);
            if (objB != coroutineSingletons) {
                str7 = str4;
                str8 = str2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            boolean z4 = routeTimeTableUIStateFactory$getTimeTableHeading$1.Z$0;
            str7 = (String) routeTimeTableUIStateFactory$getTimeTableHeading$1.L$2;
            str5 = (String) routeTimeTableUIStateFactory$getTimeTableHeading$1.L$1;
            str8 = (String) routeTimeTableUIStateFactory$getTimeTableHeading$1.L$0;
            ResultKt.b(objB);
            z2 = z4;
        } else {
            if (i2 == 2) {
                boolean z5 = routeTimeTableUIStateFactory$getTimeTableHeading$1.Z$0;
                String str10 = (String) routeTimeTableUIStateFactory$getTimeTableHeading$1.L$2;
                String str11 = (String) routeTimeTableUIStateFactory$getTimeTableHeading$1.L$1;
                String str12 = (String) routeTimeTableUIStateFactory$getTimeTableHeading$1.L$0;
                ResultKt.b(objB);
                z2 = z5;
                str9 = str10;
                c = 0;
                str7 = str11;
                str5 = str12;
                UITextStyle uITextStyle = UITextStyle.HeadlineMedium;
                StyledTextDataUIState styledTextDataUIState = new StyledTextDataUIState(str9, null, null, uITextStyle, null, null, null, 1014);
                StyledTextDataUIState styledTextDataUIState2 = new StyledTextDataUIState(" ", null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                StyledTextDataUIState styledTextDataUIState3 = new StyledTextDataUIState((String) objB, null, null, uITextStyle, null, null, null, 1014);
                StyledTextDataUIState[] styledTextDataUIStateArr = new StyledTextDataUIState[3];
                styledTextDataUIStateArr[c] = styledTextDataUIState;
                styledTextDataUIStateArr[1] = styledTextDataUIState2;
                styledTextDataUIStateArr[2] = styledTextDataUIState3;
                styledTextUIState = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr), null, null, 30);
                str6 = str7;
                if (str5 != null && str6 != null) {
                    StringEnum stringEnum2 = StringEnum.SCHEDULE_FIRST_LAST_BUS;
                    Object[] objArr2 = new Object[2];
                    objArr2[c] = str5;
                    objArr2[1] = str6;
                    routeTimeTableUIStateFactory$getTimeTableHeading$1.L$0 = styledTextUIState;
                    routeTimeTableUIStateFactory$getTimeTableHeading$1.L$1 = null;
                    routeTimeTableUIStateFactory$getTimeTableHeading$1.L$2 = null;
                    routeTimeTableUIStateFactory$getTimeTableHeading$1.Z$0 = z2;
                    routeTimeTableUIStateFactory$getTimeTableHeading$1.label = 3;
                    objB = stringProvider.b(stringEnum2, objArr2, routeTimeTableUIStateFactory$getTimeTableHeading$1);
                    if (objB != coroutineSingletons) {
                        styledTextUIState2 = styledTextUIState;
                        z3 = z2;
                    }
                    return coroutineSingletons;
                }
                return new TimeTableSectionHeaderUIState(styledTextUIState, styledTextUIState3, z2);
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = routeTimeTableUIStateFactory$getTimeTableHeading$1.Z$0;
            styledTextUIState2 = (TextUIState.StyledTextUIState) routeTimeTableUIStateFactory$getTimeTableHeading$1.L$0;
            ResultKt.b(objB);
        }
        z2 = z3;
        styledTextUIState = styledTextUIState2;
        styledTextUIState3 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB, null, null, UITextStyle.BodySmall, null, null, null, 1014)), null, null, 30);
        return new TimeTableSectionHeaderUIState(styledTextUIState, styledTextUIState3, z2);
        String str13 = (String) objB;
        c = 0;
        routeTimeTableUIStateFactory$getTimeTableHeading$1.L$0 = str5;
        routeTimeTableUIStateFactory$getTimeTableHeading$1.L$1 = str7;
        routeTimeTableUIStateFactory$getTimeTableHeading$1.L$2 = str13;
        routeTimeTableUIStateFactory$getTimeTableHeading$1.Z$0 = z2;
        routeTimeTableUIStateFactory$getTimeTableHeading$1.label = 2;
        objB = stringProvider.b(StringEnum.END_TO_STOP, new Object[]{str8}, routeTimeTableUIStateFactory$getTimeTableHeading$1);
        if (objB != coroutineSingletons) {
            str9 = str13;
            UITextStyle uITextStyle2 = UITextStyle.HeadlineMedium;
            StyledTextDataUIState styledTextDataUIState4 = new StyledTextDataUIState(str9, null, null, uITextStyle2, null, null, null, 1014);
            StyledTextDataUIState styledTextDataUIState5 = new StyledTextDataUIState(" ", null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
            StyledTextDataUIState styledTextDataUIState6 = new StyledTextDataUIState((String) objB, null, null, uITextStyle2, null, null, null, 1014);
            StyledTextDataUIState[] styledTextDataUIStateArr2 = new StyledTextDataUIState[3];
            styledTextDataUIStateArr2[c] = styledTextDataUIState4;
            styledTextDataUIStateArr2[1] = styledTextDataUIState5;
            styledTextDataUIStateArr2[2] = styledTextDataUIState6;
            styledTextUIState = new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr2), null, null, 30);
            str6 = str7;
            if (str5 != null) {
                StringEnum stringEnum3 = StringEnum.SCHEDULE_FIRST_LAST_BUS;
                Object[] objArr3 = new Object[2];
                objArr3[c] = str5;
                objArr3[1] = str6;
                routeTimeTableUIStateFactory$getTimeTableHeading$1.L$0 = styledTextUIState;
                routeTimeTableUIStateFactory$getTimeTableHeading$1.L$1 = null;
                routeTimeTableUIStateFactory$getTimeTableHeading$1.L$2 = null;
                routeTimeTableUIStateFactory$getTimeTableHeading$1.Z$0 = z2;
                routeTimeTableUIStateFactory$getTimeTableHeading$1.label = 3;
                objB = stringProvider.b(stringEnum3, objArr3, routeTimeTableUIStateFactory$getTimeTableHeading$1);
                if (objB != coroutineSingletons) {
                    styledTextUIState2 = styledTextUIState;
                    z3 = z2;
                    z2 = z3;
                    styledTextUIState = styledTextUIState2;
                    styledTextUIState3 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB, null, null, UITextStyle.BodySmall, null, null, null, 1014)), null, null, 30);
                }
            }
            return new TimeTableSectionHeaderUIState(styledTextUIState, styledTextUIState3, z2);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(TimeTableUiModel timeTableUiModel, boolean z, ContinuationImpl continuationImpl) {
        RouteTimeTableUIStateFactory$getTimeTableSectionUIState$1 routeTimeTableUIStateFactory$getTimeTableSectionUIState$1;
        TimeTableSectionHeaderUIState timeTableSectionHeaderUIState;
        if (continuationImpl instanceof RouteTimeTableUIStateFactory$getTimeTableSectionUIState$1) {
            routeTimeTableUIStateFactory$getTimeTableSectionUIState$1 = (RouteTimeTableUIStateFactory$getTimeTableSectionUIState$1) continuationImpl;
            int i = routeTimeTableUIStateFactory$getTimeTableSectionUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeTimeTableUIStateFactory$getTimeTableSectionUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                routeTimeTableUIStateFactory$getTimeTableSectionUIState$1 = new RouteTimeTableUIStateFactory$getTimeTableSectionUIState$1(this, continuationImpl);
            }
        } else {
            routeTimeTableUIStateFactory$getTimeTableSectionUIState$1 = new RouteTimeTableUIStateFactory$getTimeTableSectionUIState$1(this, continuationImpl);
        }
        RouteTimeTableUIStateFactory$getTimeTableSectionUIState$1 routeTimeTableUIStateFactory$getTimeTableSectionUIState$2 = routeTimeTableUIStateFactory$getTimeTableSectionUIState$1;
        Object objA = routeTimeTableUIStateFactory$getTimeTableSectionUIState$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeTimeTableUIStateFactory$getTimeTableSectionUIState$2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                timeTableUiModel = (TimeTableUiModel) routeTimeTableUIStateFactory$getTimeTableSectionUIState$2.L$0;
                ResultKt.b(objA);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                timeTableSectionHeaderUIState = (TimeTableSectionHeaderUIState) routeTimeTableUIStateFactory$getTimeTableSectionUIState$2.L$0;
                ResultKt.b(objA);
            }
            return new TimeTableSectionsUIState(timeTableSectionHeaderUIState, (List) objA);
        }
        ResultKt.b(objA);
        if (timeTableUiModel.f4422a.isEmpty()) {
            return null;
        }
        String str = timeTableUiModel.c;
        String str2 = timeTableUiModel.d;
        String str3 = timeTableUiModel.e;
        String str4 = timeTableUiModel.f;
        routeTimeTableUIStateFactory$getTimeTableSectionUIState$2.L$0 = timeTableUiModel;
        routeTimeTableUIStateFactory$getTimeTableSectionUIState$2.label = 1;
        objA = a(str, str2, str3, str4, z, routeTimeTableUIStateFactory$getTimeTableSectionUIState$2);
        if (objA != obj) {
        }
        return obj;
        TimeTableSectionHeaderUIState timeTableSectionHeaderUIState2 = (TimeTableSectionHeaderUIState) objA;
        ArrayList arrayList = timeTableUiModel.f4422a;
        int i3 = timeTableUiModel.b;
        routeTimeTableUIStateFactory$getTimeTableSectionUIState$2.L$0 = timeTableSectionHeaderUIState2;
        routeTimeTableUIStateFactory$getTimeTableSectionUIState$2.label = 2;
        objA = d(arrayList, i3, routeTimeTableUIStateFactory$getTimeTableSectionUIState$2);
        if (objA != obj) {
            timeTableSectionHeaderUIState = timeTableSectionHeaderUIState2;
            return new TimeTableSectionsUIState(timeTableSectionHeaderUIState, (List) objA);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(RouteTripTimingUiModel routeTripTimingUiModel, boolean z, ContinuationImpl continuationImpl) {
        RouteTimeTableUIStateFactory$getTimeTableSlot$3 routeTimeTableUIStateFactory$getTimeTableSlot$3;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object obj;
        int i;
        StyledTextDataUIState[] styledTextDataUIStateArr3;
        StyledTextDataUIState[] styledTextDataUIStateArr4;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        int i2;
        RouteTripTimingUiModel routeTripTimingUiModel2 = routeTripTimingUiModel;
        if (continuationImpl instanceof RouteTimeTableUIStateFactory$getTimeTableSlot$3) {
            routeTimeTableUIStateFactory$getTimeTableSlot$3 = (RouteTimeTableUIStateFactory$getTimeTableSlot$3) continuationImpl;
            int i3 = routeTimeTableUIStateFactory$getTimeTableSlot$3.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                routeTimeTableUIStateFactory$getTimeTableSlot$3.label = i3 - Integer.MIN_VALUE;
            } else {
                routeTimeTableUIStateFactory$getTimeTableSlot$3 = new RouteTimeTableUIStateFactory$getTimeTableSlot$3(this, continuationImpl);
            }
        } else {
            routeTimeTableUIStateFactory$getTimeTableSlot$3 = new RouteTimeTableUIStateFactory$getTimeTableSlot$3(this, continuationImpl);
        }
        Object objB = routeTimeTableUIStateFactory$getTimeTableSlot$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = routeTimeTableUIStateFactory$getTimeTableSlot$3.label;
        ChaloColorToken.Gray42 gray42 = ChaloColorToken.Gray42.f9797a;
        StringProvider stringProvider = this.f4941a;
        if (i4 == 0) {
            ResultKt.b(objB);
            ChaloColorToken chaloColorToken = z ? ChaloColorToken.OrangePrimary.f9835a : ChaloColorToken.Black.f9759a;
            if (routeTripTimingUiModel2 instanceof RouteTripTimingUiModel.FixedTimingUiModel) {
                return new TimeTableTimingUIState.FixedTiming(new TextUIState.ChaloTextUIState(((RouteTripTimingUiModel.FixedTimingUiModel) routeTripTimingUiModel2).f4412a, UITextStyle.HeadlineMedium, chaloColorToken, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
            }
            if (!(routeTripTimingUiModel2 instanceof RouteTripTimingUiModel.FrequencyTimingUiModel)) {
                throw new NoWhenBranchMatchedException();
            }
            RouteTripTimingUiModel.FrequencyTimingUiModel frequencyTimingUiModel = (RouteTripTimingUiModel.FrequencyTimingUiModel) routeTripTimingUiModel2;
            TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(vo1.n(frequencyTimingUiModel.f4413a, " - ", frequencyTimingUiModel.b), UITextStyle.HeadlineMedium, chaloColorToken, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            styledTextDataUIStateArr = new StyledTextDataUIState[3];
            routeTimeTableUIStateFactory$getTimeTableSlot$3.L$0 = routeTripTimingUiModel2;
            routeTimeTableUIStateFactory$getTimeTableSlot$3.L$1 = styledTextDataUIStateArr;
            routeTimeTableUIStateFactory$getTimeTableSlot$3.L$2 = chaloTextUIState3;
            routeTimeTableUIStateFactory$getTimeTableSlot$3.L$3 = styledTextDataUIStateArr;
            routeTimeTableUIStateFactory$getTimeTableSlot$3.I$0 = 0;
            routeTimeTableUIStateFactory$getTimeTableSlot$3.label = 1;
            Object objB2 = stringProvider.b(StringEnum.EVERY, new Object[0], routeTimeTableUIStateFactory$getTimeTableSlot$3);
            if (objB2 != coroutineSingletons) {
                styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                chaloTextUIState = chaloTextUIState3;
                obj = objB2;
                i = 0;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            int i5 = routeTimeTableUIStateFactory$getTimeTableSlot$3.I$0;
            StyledTextDataUIState[] styledTextDataUIStateArr5 = (StyledTextDataUIState[]) routeTimeTableUIStateFactory$getTimeTableSlot$3.L$3;
            TextUIState.ChaloTextUIState chaloTextUIState4 = (TextUIState.ChaloTextUIState) routeTimeTableUIStateFactory$getTimeTableSlot$3.L$2;
            StyledTextDataUIState[] styledTextDataUIStateArr6 = (StyledTextDataUIState[]) routeTimeTableUIStateFactory$getTimeTableSlot$3.L$1;
            RouteTripTimingUiModel routeTripTimingUiModel3 = (RouteTripTimingUiModel) routeTimeTableUIStateFactory$getTimeTableSlot$3.L$0;
            ResultKt.b(objB);
            styledTextDataUIStateArr2 = styledTextDataUIStateArr5;
            styledTextDataUIStateArr = styledTextDataUIStateArr6;
            chaloTextUIState = chaloTextUIState4;
            obj = objB;
            i = i5;
            routeTripTimingUiModel2 = routeTripTimingUiModel3;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i6 = routeTimeTableUIStateFactory$getTimeTableSlot$3.I$0;
            styledTextDataUIStateArr3 = (StyledTextDataUIState[]) routeTimeTableUIStateFactory$getTimeTableSlot$3.L$2;
            chaloTextUIState2 = (TextUIState.ChaloTextUIState) routeTimeTableUIStateFactory$getTimeTableSlot$3.L$1;
            styledTextDataUIStateArr4 = (StyledTextDataUIState[]) routeTimeTableUIStateFactory$getTimeTableSlot$3.L$0;
            ResultKt.b(objB);
            i2 = i6;
        }
        styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) objB, gray42, null, UITextStyle.TitleLarge, null, null, null, 1012);
        return new TimeTableTimingUIState.FrequencyTiming(chaloTextUIState2, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr4), null, null, 30));
        TextUIState.ChaloTextUIState chaloTextUIState5 = chaloTextUIState;
        styledTextDataUIStateArr2[i] = new StyledTextDataUIState((String) obj, gray42, null, UITextStyle.TitleLarge, null, null, null, 1012);
        styledTextDataUIStateArr[1] = new StyledTextDataUIState(((RouteTripTimingUiModel.FrequencyTimingUiModel) routeTripTimingUiModel2).c + " ", null, null, UITextStyle.HeadlineMedium, null, null, null, 1014);
        routeTimeTableUIStateFactory$getTimeTableSlot$3.L$0 = styledTextDataUIStateArr;
        routeTimeTableUIStateFactory$getTimeTableSlot$3.L$1 = chaloTextUIState5;
        routeTimeTableUIStateFactory$getTimeTableSlot$3.L$2 = styledTextDataUIStateArr;
        routeTimeTableUIStateFactory$getTimeTableSlot$3.L$3 = null;
        routeTimeTableUIStateFactory$getTimeTableSlot$3.I$0 = 2;
        routeTimeTableUIStateFactory$getTimeTableSlot$3.label = 2;
        objB = stringProvider.b(StringEnum.MIN, new Object[0], routeTimeTableUIStateFactory$getTimeTableSlot$3);
        if (objB != coroutineSingletons) {
            styledTextDataUIStateArr3 = styledTextDataUIStateArr;
            styledTextDataUIStateArr4 = styledTextDataUIStateArr3;
            chaloTextUIState2 = chaloTextUIState5;
            i2 = 2;
            styledTextDataUIStateArr3[i2] = new StyledTextDataUIState((String) objB, gray42, null, UITextStyle.TitleLarge, null, null, null, 1012);
            return new TimeTableTimingUIState.FrequencyTiming(chaloTextUIState2, new TextUIState.StyledTextUIState(CollectionsKt.S(styledTextDataUIStateArr4), null, null, 30));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007d -> B:27:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(java.util.ArrayList r8, int r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteTimeTableUIStateFactory$getTimeTableSlot$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteTimeTableUIStateFactory$getTimeTableSlot$1 r0 = (app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteTimeTableUIStateFactory$getTimeTableSlot$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteTimeTableUIStateFactory$getTimeTableSlot$1 r0 = new app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteTimeTableUIStateFactory$getTimeTableSlot$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$2
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r5 = r0.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$0
            java.util.Collection r6 = (java.util.Collection) r6
            kotlin.ResultKt.b(r10)
            goto L7f
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            kotlin.ResultKt.b(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.v(r8, r2)
            r10.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r2 = r10
            r8 = r3
        L55:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L8b
            java.lang.Object r10 = r5.next()
            int r6 = r8 + 1
            if (r8 < 0) goto L86
            app.chalo.livetracking.routedetails.data.model.ui.RouteTripTimingUiModel r10 = (app.chalo.livetracking.routedetails.data.model.ui.RouteTripTimingUiModel) r10
            if (r8 != r9) goto L69
            r8 = r4
            goto L6a
        L69:
            r8 = r3
        L6a:
            r0.L$0 = r2
            r0.L$1 = r5
            r0.L$2 = r2
            r0.I$0 = r9
            r0.I$1 = r6
            r0.label = r4
            java.lang.Object r10 = r7.c(r10, r8, r0)
            if (r10 != r1) goto L7d
            return r1
        L7d:
            r8 = r6
            r6 = r2
        L7f:
            app.chalo.livetracking.ui.routedetailsscreen.TimeTableTimingUIState r10 = (app.chalo.livetracking.ui.routedetailsscreen.TimeTableTimingUIState) r10
            r2.add(r10)
            r2 = r6
            goto L55
        L86:
            kotlin.collections.CollectionsKt.z0()
            r8 = 0
            throw r8
        L8b:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteTimeTableUIStateFactory.d(java.util.ArrayList, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
    
        if (r2 == r4) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e2 -> B:31:0x00e5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(app.chalo.livetracking.routedetails.data.model.ui.RouteTimeTableUiModel r20, defpackage.t11 r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.ui.routedetailsscreen.uistatefactory.RouteTimeTableUIStateFactory.e(app.chalo.livetracking.routedetails.data.model.ui.RouteTimeTableUiModel, t11, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
