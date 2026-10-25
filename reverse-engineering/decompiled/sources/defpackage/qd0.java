package defpackage;

import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.material3.ListItemKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import app.cash.sqldelight.db.SqlCursor;
import app.chalo.livetracking.frameworklivetracking.data.error.LiveTrackingRemoteDataException;
import app.chalo.livetracking.routedetails.data.error.RouteDetailsRemoteDataException;
import app.chalo.network.model.GenericChaloErrorResponse;
import io.github.alexzhirkevich.keight.js.interpreter.LexerKt;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.format.DateTimeFormatBuilderKt;
import kotlinx.datetime.format.LocalDateTimeFormatKt;
import kotlinx.datetime.format.LocalTimeFormatKt;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.serializers.LocalDateComponentSerializer;
import kotlinx.datetime.serializers.LocalDateTimeComponentSerializer;
import kotlinx.datetime.serializers.LocalTimeComponentSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import kotlinx.serialization.internal.ShortSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qd0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19111a;

    public /* synthetic */ qd0(int i) {
        this.f19111a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char c;
        String str;
        String str2;
        String str3;
        int i = this.f19111a;
        int i2 = 0;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                return LazyGridIntervalContent.stickyHeader$lambda$1((LazyGridItemSpanScope) obj);
            case 1:
                return LazyGridMeasureKt.measureLazyGrid_t1x4au0$lambda$2((Placeable.PlacementScope) obj);
            case 2:
                return LazyGridState.Saver$lambda$1((List) obj);
            case 3:
                return LazyGridStateKt.EmptyLazyGridLayoutInfo$lambda$0(((Integer) obj).intValue());
            case 4:
                return Integer.valueOf(LazyGridStateKt.EmptyLazyGridLayoutInfo$lambda$1(((Integer) obj).intValue()));
            case 5:
                return LazyListMeasureKt.measureLazyList__s_dbAc$lambda$2((Placeable.PlacementScope) obj);
            case 6:
                return LazyListScope.CC.q(((Integer) obj).intValue());
            case 7:
                return LazyListState.Saver$lambda$1((List) obj);
            case 8:
                return LazyStaggeredGridMeasureKt.measure$lambda$0$0((Placeable.PlacementScope) obj);
            case 9:
                return LazyStaggeredGridState.Saver$lambda$1((List) obj);
            case 10:
                return LegacyTextFieldState.onValueChangeOriginal$lambda$0((TextFieldValue) obj);
            case 11:
                return LegacyTextInputMethodRequest.onEditCommand$lambda$0((List) obj);
            case 12:
                return LegacyTextInputMethodRequest.onImeActionPerformed$lambda$0((ImeAction) obj);
            case 13:
                MatchResult it = (MatchResult) obj;
                Set set = LexerKt.f16446a;
                Intrinsics.i(it, "it");
                String strN = StringsKt.N(StringsKt.M(StringsKt.M(it.getValue(), "\\u"), "{"), "}");
                CharsKt.b(16);
                int i3 = Integer.parseInt(strN, 16) - 65536;
                int i4 = (i3 / 1024) + 55296;
                int i5 = (i3 % 1024) + 56320;
                if (i4 < 0 || i4 > 65535) {
                    throw new IllegalArgumentException(vo1.j(i4, "Invalid Char code: "));
                }
                char c2 = (char) i4;
                if (i5 < 0 || i5 > 65535) {
                    throw new IllegalArgumentException(vo1.j(i5, "Invalid Char code: "));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(c2);
                sb.append((char) i5);
                return sb.toString();
            case 14:
                MatchResult it2 = (MatchResult) obj;
                Set set2 = LexerKt.f16446a;
                Intrinsics.i(it2, "it");
                String strN2 = StringsKt.N(StringsKt.M(StringsKt.M(it2.getValue(), "\\u"), "{"), "}");
                CharsKt.b(16);
                int i6 = Integer.parseInt(strN2, 16);
                if (LexerKt.g.contains(Integer.valueOf(i6))) {
                    c = '\n';
                } else {
                    if (i6 < 0 || i6 > 65535) {
                        throw new IllegalArgumentException(vo1.j(i6, "Invalid Char code: "));
                    }
                    c = (char) i6;
                }
                return String.valueOf(c);
            case 15:
                return ListItemKt.ListItem_HXNGIdc$lambda$5$lambda$4((SemanticsPropertyReceiver) obj);
            case 16:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse == null || (str = genericChaloErrorResponse.b) == null) {
                    str = "Something went wrong";
                }
                return new LiveTrackingRemoteDataException(genericChaloErrorResponse, str);
            case 17:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse2 == null || (str2 = genericChaloErrorResponse2.b) == null) {
                    str2 = "Something went wrong";
                }
                return new RouteDetailsRemoteDataException(genericChaloErrorResponse2, str2);
            case 18:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse3 == null || (str3 = genericChaloErrorResponse3.b) == null) {
                    str3 = "Something went wrong";
                }
                return new RouteDetailsRemoteDataException(genericChaloErrorResponse3, str3);
            case 19:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("load_money_table");
                return unit;
            case 20:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("load_money_table");
                return unit;
            case 21:
                return uf0.i((SqlCursor) obj, "cursor", 0);
            case 22:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("load_money_table");
                return unit;
            case 23:
                ClassSerialDescriptorBuilder buildClassSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                SerialDescriptorImpl serialDescriptorImpl = LocalDateComponentSerializer.f18062a;
                Intrinsics.i(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                EmptyList emptyList = EmptyList.f17557a;
                IntSerializer intSerializer = IntSerializer.f18146a;
                buildClassSerialDescriptor.a("year", IntSerializer.b, emptyList, false);
                ShortSerializer shortSerializer = ShortSerializer.f18169a;
                PrimitiveSerialDescriptor primitiveSerialDescriptor = ShortSerializer.b;
                buildClassSerialDescriptor.a("month", primitiveSerialDescriptor, emptyList, false);
                buildClassSerialDescriptor.a("day", primitiveSerialDescriptor, emptyList, false);
                return unit;
            case 24:
                ClassSerialDescriptorBuilder buildClassSerialDescriptor2 = (ClassSerialDescriptorBuilder) obj;
                SerialDescriptorImpl serialDescriptorImpl2 = LocalDateTimeComponentSerializer.f18066a;
                Intrinsics.i(buildClassSerialDescriptor2, "$this$buildClassSerialDescriptor");
                EmptyList emptyList2 = EmptyList.f17557a;
                IntSerializer intSerializer2 = IntSerializer.f18146a;
                PrimitiveSerialDescriptor primitiveSerialDescriptor2 = IntSerializer.b;
                buildClassSerialDescriptor2.a("year", primitiveSerialDescriptor2, emptyList2, false);
                ShortSerializer shortSerializer2 = ShortSerializer.f18169a;
                PrimitiveSerialDescriptor primitiveSerialDescriptor3 = ShortSerializer.b;
                buildClassSerialDescriptor2.a("month", primitiveSerialDescriptor3, emptyList2, false);
                buildClassSerialDescriptor2.a("day", primitiveSerialDescriptor3, emptyList2, false);
                buildClassSerialDescriptor2.a("hour", primitiveSerialDescriptor3, emptyList2, false);
                buildClassSerialDescriptor2.a("minute", primitiveSerialDescriptor3, emptyList2, false);
                buildClassSerialDescriptor2.a("second", primitiveSerialDescriptor3, emptyList2, true);
                buildClassSerialDescriptor2.a("nanosecond", primitiveSerialDescriptor2, emptyList2, true);
                return unit;
            case 25:
                DateTimeFormatBuilder.WithDateTime alternativeParsing = (DateTimeFormatBuilder.WithDateTime) obj;
                Lazy lazy = LocalDateTimeFormatKt.f17967a;
                Intrinsics.i(alternativeParsing, "$this$alternativeParsing");
                DateTimeFormatBuilderKt.b(alternativeParsing, 't');
                return unit;
            case 26:
                DateTimeFormatBuilder.WithDateTime alternativeParsing2 = (DateTimeFormatBuilder.WithDateTime) obj;
                Lazy lazy2 = LocalDateTimeFormatKt.f17967a;
                Intrinsics.i(alternativeParsing2, "$this$alternativeParsing");
                DateTimeFormatBuilderKt.b(alternativeParsing2, 'T');
                return unit;
            case 27:
                ClassSerialDescriptorBuilder buildClassSerialDescriptor3 = (ClassSerialDescriptorBuilder) obj;
                SerialDescriptorImpl serialDescriptorImpl3 = LocalTimeComponentSerializer.f18069a;
                Intrinsics.i(buildClassSerialDescriptor3, "$this$buildClassSerialDescriptor");
                EmptyList emptyList3 = EmptyList.f17557a;
                ShortSerializer shortSerializer3 = ShortSerializer.f18169a;
                PrimitiveSerialDescriptor primitiveSerialDescriptor4 = ShortSerializer.b;
                buildClassSerialDescriptor3.a("hour", primitiveSerialDescriptor4, emptyList3, false);
                buildClassSerialDescriptor3.a("minute", primitiveSerialDescriptor4, emptyList3, false);
                buildClassSerialDescriptor3.a("second", primitiveSerialDescriptor4, emptyList3, true);
                IntSerializer intSerializer3 = IntSerializer.f18146a;
                buildClassSerialDescriptor3.a("nanosecond", IntSerializer.b, emptyList3, true);
                return unit;
            case 28:
                Lazy lazy3 = LocalTimeFormatKt.f17970a;
                Intrinsics.i((DateTimeFormatBuilder.WithTime) obj, "$this$alternativeParsing");
                return unit;
            default:
                DateTimeFormatBuilder.WithTime alternativeParsing3 = (DateTimeFormatBuilder.WithTime) obj;
                Lazy lazy4 = LocalTimeFormatKt.f17970a;
                Intrinsics.i(alternativeParsing3, "$this$alternativeParsing");
                DateTimeFormatBuilderKt.b(alternativeParsing3, ':');
                alternativeParsing3.s(Padding.ZERO);
                DateTimeFormatBuilderKt.c(alternativeParsing3, "", new kf0(i2));
                return unit;
        }
    }
}
