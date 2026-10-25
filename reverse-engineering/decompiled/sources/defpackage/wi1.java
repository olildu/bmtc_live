package defpackage;

import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerStateImpl;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.productsummary.ui.ticket.TicketSummaryDataState;
import app.chalo.titoridedetail.ui.TITORideDetailBottomsheetType;
import app.chalo.titoridedetail.ui.TITORideDetailScreenType;
import app.chalo.titoridedetail.ui.TitoRideDetailsViewState;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.format.DateTimeFormatBuilderKt;
import kotlinx.datetime.format.MonthNames;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.serializers.TimeBasedDateTimeUnitSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.internal.LongSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wi1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19932a;

    public /* synthetic */ wi1(int i) {
        this.f19932a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19932a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 1:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 2:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 3:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 4:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 5:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, 32763);
            case 6:
                ClassSerialDescriptorBuilder buildClassSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                TimeBasedDateTimeUnitSerializer timeBasedDateTimeUnitSerializer = TimeBasedDateTimeUnitSerializer.f18074a;
                Intrinsics.i(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                EmptyList emptyList = EmptyList.f17557a;
                LongSerializer longSerializer = LongSerializer.f18151a;
                buildClassSerialDescriptor.a("nanoseconds", LongSerializer.b, emptyList, false);
                return unit;
            case 7:
                return TimePickerKt.DisplaySeparator$lambda$52$lambda$51((SemanticsPropertyReceiver) obj);
            case 8:
                return TimePickerKt.VerticalTimePicker$lambda$9$lambda$8((SemanticsPropertyReceiver) obj);
            case 9:
                return TimePickerKt.HorizontalTimePicker$lambda$13$lambda$12((SemanticsPropertyReceiver) obj);
            case 10:
                return TimePickerKt.TimePickerTextField_1vLObsk$lambda$92$lambda$91$lambda$90((SemanticsPropertyReceiver) obj);
            case 11:
                return TimePickerStateImpl.Companion.Saver$lambda$1((List) obj);
            case 12:
                DateTimeFormatBuilder.WithDateTime Format = (DateTimeFormatBuilder.WithDateTime) obj;
                Intrinsics.i(Format, "$this$Format");
                Format.u(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format, ':');
                Format.r(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format, ':');
                Format.s(Padding.ZERO);
                Format.e(", ");
                Format.w(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format, ' ');
                Format.j(MonthNames.c);
                DateTimeFormatBuilderKt.b(Format, ' ');
                Format.t(Padding.ZERO);
                return unit;
            case 13:
                DateTimeFormatBuilder.WithTime Format2 = (DateTimeFormatBuilder.WithTime) obj;
                Intrinsics.i(Format2, "$this$Format");
                Format2.d(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format2, ':');
                Format2.r(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format2, ' ');
                Format2.b();
                return unit;
            case 14:
                DateTimeFormatBuilder.WithDateTime Format3 = (DateTimeFormatBuilder.WithDateTime) obj;
                Intrinsics.i(Format3, "$this$Format");
                Format3.d(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format3, ':');
                Format3.r(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format3, ' ');
                Format3.b();
                Format3.e(", ");
                Format3.w(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format3, ' ');
                Format3.j(MonthNames.c);
                DateTimeFormatBuilderKt.b(Format3, ' ');
                Format3.t(Padding.ZERO);
                return unit;
            case 15:
                DateTimeFormatBuilder.WithTime Format4 = (DateTimeFormatBuilder.WithTime) obj;
                Intrinsics.i(Format4, "$this$Format");
                Format4.d(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format4, ':');
                Format4.r(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format4, ' ');
                Format4.b();
                return unit;
            case 16:
                DateTimeFormatBuilder.WithTime Format5 = (DateTimeFormatBuilder.WithTime) obj;
                Intrinsics.i(Format5, "$this$Format");
                Format5.d(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format5, ':');
                Format5.r(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format5, ' ');
                Format5.b();
                return unit;
            case 17:
                DateTimeFormatBuilder.WithDateTime Format6 = (DateTimeFormatBuilder.WithDateTime) obj;
                Intrinsics.i(Format6, "$this$Format");
                Format6.d(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format6, ':');
                Format6.r(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format6, ' ');
                Format6.b();
                Format6.e(", ");
                Format6.w(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format6, ' ');
                Format6.j(MonthNames.c);
                DateTimeFormatBuilderKt.b(Format6, ' ');
                Format6.t(Padding.ZERO);
                return unit;
            case 18:
                DateTimeFormatBuilder.WithTime Format7 = (DateTimeFormatBuilder.WithTime) obj;
                Intrinsics.i(Format7, "$this$Format");
                Format7.d(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format7, ':');
                Format7.r(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format7, ' ');
                Format7.b();
                return unit;
            case 19:
                DateTimeFormatBuilder.WithTime Format8 = (DateTimeFormatBuilder.WithTime) obj;
                Intrinsics.i(Format8, "$this$Format");
                Format8.d(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format8, ':');
                Format8.r(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format8, ' ');
                Format8.b();
                return unit;
            case 20:
                Intrinsics.i((MapCameraUpdate) obj, "it");
                return unit;
            case 21:
                TitoRideDetailsViewState it = (TitoRideDetailsViewState) obj;
                Intrinsics.i(it, "it");
                return TitoRideDetailsViewState.a(it, null, null, null, true, null, null, null, null, 0.0d, false, 2031);
            case 22:
                TitoRideDetailsViewState it2 = (TitoRideDetailsViewState) obj;
                Intrinsics.i(it2, "it");
                return TitoRideDetailsViewState.a(it2, null, null, TITORideDetailBottomsheetType.NONE, false, null, null, null, null, 0.0d, false, 2043);
            case 23:
                TitoRideDetailsViewState it3 = (TitoRideDetailsViewState) obj;
                Intrinsics.i(it3, "it");
                return TitoRideDetailsViewState.a(it3, null, TITORideDetailScreenType.TITO_ONBOARDING_SCREEN, null, false, null, null, null, null, 0.0d, false, 1021);
            case 24:
                TitoRideDetailsViewState it4 = (TitoRideDetailsViewState) obj;
                Intrinsics.i(it4, "it");
                return TitoRideDetailsViewState.a(it4, null, TITORideDetailScreenType.TITO_ONBOARDING_FINISH_SCREEN, null, false, null, null, null, null, 0.0d, false, 1021);
            case 25:
                TitoRideDetailsViewState it5 = (TitoRideDetailsViewState) obj;
                Intrinsics.i(it5, "it");
                return TitoRideDetailsViewState.a(it5, null, TITORideDetailScreenType.MAP_WITH_ETA_BOTTOM_SHEET, null, false, null, null, null, null, 0.0d, true, 1021);
            case 26:
                TitoRideDetailsViewState it6 = (TitoRideDetailsViewState) obj;
                Intrinsics.i(it6, "it");
                return TitoRideDetailsViewState.a(it6, null, TITORideDetailScreenType.MISSED_TAP_OUT_FEEDBACK_SCREEN, null, false, null, null, null, null, 0.0d, true, 1021);
            case 27:
                TitoRideDetailsViewState it7 = (TitoRideDetailsViewState) obj;
                Intrinsics.i(it7, "it");
                return TitoRideDetailsViewState.a(it7, null, TITORideDetailScreenType.MAP_WITH_ETA_BOTTOM_SHEET, null, false, null, null, null, null, 0.0d, true, 1021);
            case 28:
                return TitoRideDetailsViewState.a((TitoRideDetailsViewState) obj, null, null, null, false, null, null, null, null, 0.0d, false, 2031);
            default:
                return TitoRideDetailsViewState.a((TitoRideDetailsViewState) obj, null, null, TITORideDetailBottomsheetType.MISSED_TAP_OUT_DONE_BOTTOMSHEET, false, null, null, null, null, 0.0d, false, 2043);
        }
    }
}
