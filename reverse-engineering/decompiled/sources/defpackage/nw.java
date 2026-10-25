package defpackage;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Draggable2DElement;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Velocity;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerValue;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerValue;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.superpass.data.remote.SyncActivationsAndFetchSuperPassTripReceiptsException;
import com.google.android.gms.ads.initialization.AdapterStatus;
import io.github.alexzhirkevich.compottie.DotLottieCompositionSpecKt;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.client.plugins.SaveBodyPluginConfig;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.util.AttributeKey;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.format.DateTimeComponents;
import kotlinx.datetime.format.DateTimeComponentsFormat;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.format.DateTimeFormatBuilderKt;
import kotlinx.datetime.format.DayOfWeekNames;
import kotlinx.datetime.format.MonthNames;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.format.UtcOffsetFormat;
import kotlinx.datetime.format.UtcOffsetFormatKt;
import kotlinx.datetime.serializers.DateTimePeriodComponentSerializer;
import kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class nw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18548a;

    public /* synthetic */ nw(int i) {
        this.f18548a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f18548a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                DateTimeFormatBuilder.WithDateTimeComponents optional = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(optional, "$this$optional");
                optional.p((UtcOffsetFormat) UtcOffsetFormatKt.c.getValue());
                return unit;
            case 1:
                DateTimeFormatBuilder.WithDateTimeComponents Format = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat2 = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(Format, "$this$Format");
                DateTimeFormatBuilderKt.a(Format, new Function1[]{new nw(7)}, new nw(8));
                Format.f(Padding.NONE);
                DateTimeFormatBuilderKt.b(Format, ' ');
                Format.j(MonthNames.c);
                DateTimeFormatBuilderKt.b(Format, ' ');
                Format.t(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format, ' ');
                Format.u(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format, ':');
                Format.r(Padding.ZERO);
                DateTimeFormatBuilderKt.c(Format, "", new nw(9));
                Format.e(" ");
                DateTimeFormatBuilderKt.a(Format, new Function1[]{new qs(27), new qs(28)}, new qs(29));
                return unit;
            case 2:
                DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat3 = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(alternativeParsing, "$this$alternativeParsing");
                DateTimeFormatBuilderKt.b(alternativeParsing, 't');
                return unit;
            case 3:
                DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing2 = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat4 = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(alternativeParsing2, "$this$alternativeParsing");
                DateTimeFormatBuilderKt.b(alternativeParsing2, 'T');
                return unit;
            case 4:
                DateTimeFormatBuilder.WithDateTimeComponents optional2 = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat5 = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(optional2, "$this$optional");
                DateTimeFormatBuilderKt.b(optional2, FilenameUtils.EXTENSION_SEPARATOR);
                optional2.c();
                return unit;
            case 5:
                DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing3 = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat6 = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(alternativeParsing3, "$this$alternativeParsing");
                alternativeParsing3.y(Padding.ZERO);
                return unit;
            case 6:
                DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing4 = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat7 = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(alternativeParsing4, "$this$alternativeParsing");
                alternativeParsing4.p((UtcOffsetFormat) UtcOffsetFormatKt.f17988a.getValue());
                return unit;
            case 7:
                DateTimeComponentsFormat dateTimeComponentsFormat8 = DateTimeComponents.Formats.f17948a;
                Intrinsics.i((DateTimeFormatBuilder.WithDateTimeComponents) obj, "$this$alternativeParsing");
                return unit;
            case 8:
                DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing5 = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat9 = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(alternativeParsing5, "$this$alternativeParsing");
                alternativeParsing5.v(DayOfWeekNames.c);
                alternativeParsing5.e(", ");
                return unit;
            case 9:
                DateTimeFormatBuilder.WithDateTimeComponents optional3 = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat10 = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(optional3, "$this$optional");
                DateTimeFormatBuilderKt.b(optional3, ':');
                optional3.s(Padding.ZERO);
                return unit;
            case 10:
                ClassSerialDescriptorBuilder buildClassSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                SerialDescriptorImpl serialDescriptorImpl = DateTimePeriodComponentSerializer.f18052a;
                Intrinsics.i(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                EmptyList emptyList = EmptyList.f17557a;
                IntSerializer intSerializer = IntSerializer.f18146a;
                PrimitiveSerialDescriptor primitiveSerialDescriptor = IntSerializer.b;
                buildClassSerialDescriptor.a("years", primitiveSerialDescriptor, emptyList, true);
                buildClassSerialDescriptor.a("months", primitiveSerialDescriptor, emptyList, true);
                buildClassSerialDescriptor.a("days", primitiveSerialDescriptor, emptyList, true);
                buildClassSerialDescriptor.a("hours", primitiveSerialDescriptor, emptyList, true);
                buildClassSerialDescriptor.a("minutes", primitiveSerialDescriptor, emptyList, true);
                buildClassSerialDescriptor.a("seconds", primitiveSerialDescriptor, emptyList, true);
                LongSerializer longSerializer = LongSerializer.f18151a;
                buildClassSerialDescriptor.a("nanoseconds", LongSerializer.b, emptyList, true);
                return unit;
            case 11:
                ClassSerialDescriptorBuilder buildClassSerialDescriptor2 = (ClassSerialDescriptorBuilder) obj;
                DayBasedDateTimeUnitSerializer dayBasedDateTimeUnitSerializer = DayBasedDateTimeUnitSerializer.f18056a;
                Intrinsics.i(buildClassSerialDescriptor2, "$this$buildClassSerialDescriptor");
                EmptyList emptyList2 = EmptyList.f17557a;
                IntSerializer intSerializer2 = IntSerializer.f18146a;
                buildClassSerialDescriptor2.a("days", IntSerializer.b, emptyList2, false);
                return unit;
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.i(entry, "<destruct>");
                return ((String) entry.getKey()) + "=" + ((AdapterStatus) entry.getValue()).getInitializationState();
            case 13:
                return DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$9$lambda$8((SemanticsPropertyReceiver) obj);
            case 14:
                return DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$20$lambda$19((SemanticsPropertyReceiver) obj);
            case 15:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new SyncActivationsAndFetchSuperPassTripReceiptsException.SyncActivationsAndFetchSuperPassTripReceiptsFetchFailedException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 16:
                JsonBuilder Json = (JsonBuilder) obj;
                Json json = DotLottieCompositionSpecKt.f16087a;
                Intrinsics.i(Json, "$this$Json");
                Json.d = true;
                Json.c = true;
                Json.k = true;
                return unit;
            case 17:
                ClientPluginBuilder createClientPlugin = (ClientPluginBuilder) obj;
                AttributeKey attributeKey = DoubleReceivePluginKt.f16649a;
                Intrinsics.i(createClientPlugin, "$this$createClientPlugin");
                ((SaveBodyPluginConfig) createClientPlugin.b).getClass();
                DoubleReceivePluginKt.a().d("The SaveBodyPlugin plugin is deprecated and can be safely removed. Request bodies are now saved in memory by default for all non-streaming responses.");
                return unit;
            case 18:
                return DragGestureDetectorKt.detectHorizontalDragGestures$lambda$0((Offset) obj);
            case 19:
                return DragGestureDetectorKt.detectDragGesturesAfterLongPress$lambda$0((Offset) obj);
            case 20:
                return DragGestureDetectorKt.detectDragGestures$lambda$0((Offset) obj);
            case 21:
                return DragGestureDetectorKt.detectVerticalDragGestures$lambda$0((Offset) obj);
            case 22:
                return DragGestureDetectorKt.detectDragGestures$lambda$7((PointerInputChange) obj);
            case 23:
                return Boolean.valueOf(Draggable2DElement.CanDrag$lambda$0((PointerType) obj));
            case 24:
                return Draggable2DKt.NoOpOnDragStart$lambda$0((Offset) obj);
            case 25:
                return Draggable2DKt.NoOpOnDragStop$lambda$0((Velocity) obj);
            case 26:
                return Boolean.valueOf(DraggableElement.CanDrag$lambda$0((PointerType) obj));
            case 27:
                DrawerValue it = (DrawerValue) obj;
                TweenSpec tweenSpec = DrawerKt.f4449a;
                Intrinsics.i(it, "it");
                return Boolean.TRUE;
            case 28:
                BottomDrawerValue it2 = (BottomDrawerValue) obj;
                TweenSpec tweenSpec2 = DrawerKt.f4449a;
                Intrinsics.i(it2, "it");
                return Boolean.TRUE;
            default:
                DrawerValue it3 = (DrawerValue) obj;
                Intrinsics.i(it3, "it");
                return Boolean.TRUE;
        }
    }
}
