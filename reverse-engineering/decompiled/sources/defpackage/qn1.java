package defpackage;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.userprofile.data.exceptions.FetchUserProfileFailedException;
import app.chalo.userprofile.data.exceptions.UpdateUserProfileFailedException;
import com.arkivanov.essenty.statekeeper.UtilsKt;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.format.DateTimeFormatBuilderKt;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.format.UtcOffsetFormatKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qn1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19138a;

    public /* synthetic */ qn1(int i) {
        this.f19138a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19138a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new UpdateUserProfileFailedException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 1:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new FetchUserProfileFailedException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 2:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("user_commute_preference_place_table");
                return unit;
            case 3:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("user_commute_preference_place_table");
                return unit;
            case 4:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("user_commute_preference_place_table");
                return unit;
            case 5:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("user_commute_preference_saved_ride_table");
                return unit;
            case 6:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("user_commute_preference_saved_ride_table");
                return unit;
            case 7:
                Function1 emit6 = (Function1) obj;
                Intrinsics.i(emit6, "emit");
                emit6.invoke("user_commute_preference_saved_ride_table");
                return unit;
            case 8:
                DateTimeFormatBuilder.WithUtcOffset optional = (DateTimeFormatBuilder.WithUtcOffset) obj;
                Lazy lazy = UtcOffsetFormatKt.f17988a;
                Intrinsics.i(optional, "$this$optional");
                DateTimeFormatBuilderKt.b(optional, ':');
                optional.z(Padding.ZERO);
                return unit;
            case 9:
                DateTimeFormatBuilder.WithUtcOffset optional2 = (DateTimeFormatBuilder.WithUtcOffset) obj;
                Lazy lazy2 = UtcOffsetFormatKt.f17988a;
                Intrinsics.i(optional2, "$this$optional");
                optional2.z(Padding.ZERO);
                return unit;
            case 10:
                DateTimeFormatBuilder.WithUtcOffset alternativeParsing = (DateTimeFormatBuilder.WithUtcOffset) obj;
                Lazy lazy3 = UtcOffsetFormatKt.f17988a;
                Intrinsics.i(alternativeParsing, "$this$alternativeParsing");
                alternativeParsing.e("z");
                return unit;
            case 11:
                DateTimeFormatBuilder.WithUtcOffset alternativeParsing2 = (DateTimeFormatBuilder.WithUtcOffset) obj;
                Lazy lazy4 = UtcOffsetFormatKt.f17988a;
                Intrinsics.i(alternativeParsing2, "$this$alternativeParsing");
                DateTimeFormatBuilderKt.c(alternativeParsing2, "Z", new qn1(14));
                return unit;
            case 12:
                DateTimeFormatBuilder.WithUtcOffset alternativeParsing3 = (DateTimeFormatBuilder.WithUtcOffset) obj;
                Lazy lazy5 = UtcOffsetFormatKt.f17988a;
                Intrinsics.i(alternativeParsing3, "$this$alternativeParsing");
                alternativeParsing3.e("z");
                return unit;
            case 13:
                DateTimeFormatBuilder.WithUtcOffset alternativeParsing4 = (DateTimeFormatBuilder.WithUtcOffset) obj;
                Lazy lazy6 = UtcOffsetFormatKt.f17988a;
                Intrinsics.i(alternativeParsing4, "$this$alternativeParsing");
                DateTimeFormatBuilderKt.c(alternativeParsing4, "Z", new qn1(15));
                return unit;
            case 14:
                DateTimeFormatBuilder.WithUtcOffset optional3 = (DateTimeFormatBuilder.WithUtcOffset) obj;
                Lazy lazy7 = UtcOffsetFormatKt.f17988a;
                Intrinsics.i(optional3, "$this$optional");
                optional3.y(Padding.ZERO);
                DateTimeFormatBuilderKt.b(optional3, ':');
                optional3.o(Padding.ZERO);
                DateTimeFormatBuilderKt.c(optional3, "", new qn1(8));
                return unit;
            case 15:
                DateTimeFormatBuilder.WithUtcOffset optional4 = (DateTimeFormatBuilder.WithUtcOffset) obj;
                Lazy lazy8 = UtcOffsetFormatKt.f17988a;
                Intrinsics.i(optional4, "$this$optional");
                optional4.y(Padding.ZERO);
                DateTimeFormatBuilderKt.c(optional4, "", new qn1(16));
                return unit;
            case 16:
                DateTimeFormatBuilder.WithUtcOffset optional5 = (DateTimeFormatBuilder.WithUtcOffset) obj;
                Lazy lazy9 = UtcOffsetFormatKt.f17988a;
                Intrinsics.i(optional5, "$this$optional");
                optional5.o(Padding.ZERO);
                DateTimeFormatBuilderKt.c(optional5, "", new qn1(9));
                return unit;
            case 17:
                JsonBuilder Json = (JsonBuilder) obj;
                Json json = UtilsKt.f12422a;
                Intrinsics.i(Json, "$this$Json");
                Json.m = true;
                return unit;
            case 18:
                return unit;
            case 19:
                return VectorConvertersKt.FloatToVector$lambda$0(((Float) obj).floatValue());
            case 20:
                return VectorConvertersKt.IntToVector$lambda$0(((Integer) obj).intValue());
            case 21:
                return Integer.valueOf(VectorConvertersKt.IntToVector$lambda$1((AnimationVector1D) obj));
            case 22:
                return VectorConvertersKt.DpToVector$lambda$0((Dp) obj);
            case 23:
                return VectorConvertersKt.DpToVector$lambda$1((AnimationVector1D) obj);
            case 24:
                return VectorConvertersKt.DpOffsetToVector$lambda$0((DpOffset) obj);
            case 25:
                return VectorConvertersKt.DpOffsetToVector$lambda$1((AnimationVector2D) obj);
            case 26:
                return VectorConvertersKt.SizeToVector$lambda$0((Size) obj);
            case 27:
                return VectorConvertersKt.SizeToVector$lambda$1((AnimationVector2D) obj);
            case 28:
                return VectorConvertersKt.OffsetToVector$lambda$0((Offset) obj);
            default:
                return VectorConvertersKt.OffsetToVector$lambda$1((AnimationVector2D) obj);
        }
    }
}
