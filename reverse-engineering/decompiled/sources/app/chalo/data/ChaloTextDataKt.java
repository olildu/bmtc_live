package app.chalo.data;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloTextDataKt {
    public static final String a(TextFormatAppModel textFormatAppModel) {
        Intrinsics.i(textFormatAppModel, "<this>");
        if (textFormatAppModel instanceof TextFormatAppModel.HtmlFormatted) {
            return ((TextFormatAppModel.HtmlFormatted) textFormatAppModel).c;
        }
        if (textFormatAppModel instanceof TextFormatAppModel.Simple) {
            return ((TextFormatAppModel.Simple) textFormatAppModel).b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(TextStyleAppModel textStyleAppModel) {
        Intrinsics.i(textStyleAppModel, "<this>");
        TextFormatAppModel textFormatAppModel = textStyleAppModel.f2406a;
        if (textFormatAppModel instanceof TextFormatAppModel.HtmlFormatted) {
            return ((TextFormatAppModel.HtmlFormatted) textFormatAppModel).c;
        }
        if (textFormatAppModel instanceof TextFormatAppModel.Simple) {
            return ((TextFormatAppModel.Simple) textFormatAppModel).b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean c(TextFormatAppModel textFormatAppModel) {
        Intrinsics.i(textFormatAppModel, "<this>");
        if (textFormatAppModel instanceof TextFormatAppModel.HtmlFormatted) {
            return ((TextFormatAppModel.HtmlFormatted) textFormatAppModel).c.length() > 0;
        }
        if (textFormatAppModel instanceof TextFormatAppModel.Simple) {
            return ((TextFormatAppModel.Simple) textFormatAppModel).b.length() > 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RoundedCornerShape d(BackgroundShape backgroundShape) {
        Intrinsics.i(backgroundShape, "<this>");
        if (backgroundShape.equals(BackgroundShape.Circle.b)) {
            return RoundedCornerShapeKt.getCircleShape();
        }
        if (!(backgroundShape instanceof BackgroundShape.Rectangle)) {
            throw new NoWhenBranchMatchedException();
        }
        BackgroundShape.Rectangle rectangle = (BackgroundShape.Rectangle) backgroundShape;
        return RoundedCornerShapeKt.m1075RoundedCornerShapea9UjIt4(Dp.m7278constructorimpl(rectangle.b), Dp.m7278constructorimpl(rectangle.c), Dp.m7278constructorimpl(rectangle.e), Dp.m7278constructorimpl(rectangle.d));
    }
}
