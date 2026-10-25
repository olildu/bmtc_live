package defpackage;

import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.TypographyTokensKt;
import app.chalo.behaviour.policy.TicketReceiptFormatConfig;
import app.chalo.constants.Source;
import app.chalo.core.database.tableadapters.TicketTableAdapter;
import app.chalo.core.database.tableadapters.TicketTableAdapter$passengerDetailsAdapter$2$1;
import app.chalo.core.database.tableadapters.TicketTableAdapter$routeStopsInfoAdapter$2$1;
import app.chalo.data.TextFormatAppModel;
import app.chalo.data.TextFormatAppModel$HtmlFormatted$$serializer;
import app.chalo.data.TextFormatAppModel$Simple$$serializer;
import app.chalo.data.TextStyleAppModel;
import app.chalo.instantticket.data.model.api.response.PassengerDetailApiModel$$serializer;
import app.chalo.livetracking.frameworklivetracking.domain.ThresholdDetails;
import app.chalo.metro.data.api.MetroFarePassengerDetailApiModel$$serializer;
import app.chalo.metro.data.api.TicketFinalFareRequestApiModel;
import app.chalo.productbooking.common.data.models.api.response.TicketBookingFareResponseApiModel;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.scenes.args.TicketPurchaseArgs$MTicketTripInfoArgs$$serializer;
import app.chalo.scenes.args.TicketPurchaseArgs$PayForTicketArgs$$serializer;
import app.chalo.scenes.args.TicketPurchaseArgs$QuickPayArgs$$serializer;
import app.chalo.scenes.args.TicketPurchaseArgs$StopSelectionArgs$InstantTicket$$serializer;
import app.chalo.scenes.args.TicketPurchaseArgs$StopSelectionArgs$ONDC$$serializer;
import app.chalo.scenes.args.TicketPurchaseArgs$StopSelectionArgs$PassPurchase$$serializer;
import app.chalo.superpass.data.models.TicketActivationsApiRequestModel;
import app.chalo.ticketvalidation.TicketQrSchemaType;
import app.chalo.utils.HtmlStyledData$$serializer;
import io.github.alexzhirkevich.compottie.internal.effects.LayerEffect;
import io.github.alexzhirkevich.compottie.internal.helpers.BooleanIntSerializer;
import io.github.alexzhirkevich.compottie.internal.helpers.Mask$$serializer;
import io.github.alexzhirkevich.compottie.internal.helpers.text.TextDocument;
import io.github.alexzhirkevich.compottie.internal.layers.TextLayer;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class qh1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19122a;

    public /* synthetic */ qh1(int i) {
        this.f19122a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19122a) {
            case 0:
                TextDocument.Companion companion = TextDocument.INSTANCE;
                return new ArrayListSerializer(FloatSerializer.f18142a);
            case 1:
                TextDocument.Companion companion2 = TextDocument.INSTANCE;
                return new ArrayListSerializer(FloatSerializer.f18142a);
            case 2:
                return TextFieldSelectionStateKt.defaultDetectTextFieldTapGestures$lambda$0$0();
            case 3:
                TextFormatAppModel.Companion companion3 = TextFormatAppModel.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.data.TextFormatAppModel", Reflection.a(TextFormatAppModel.class), new KClass[]{Reflection.a(TextFormatAppModel.HtmlFormatted.class), Reflection.a(TextFormatAppModel.Simple.class)}, new KSerializer[]{TextFormatAppModel$HtmlFormatted$$serializer.f2404a, TextFormatAppModel$Simple$$serializer.f2405a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 4:
                TextFormatAppModel.HtmlFormatted.Companion companion4 = TextFormatAppModel.HtmlFormatted.INSTANCE;
                return new ArrayListSerializer(HtmlStyledData$$serializer.f10427a);
            case 5:
                return TypographyTokensKt.getDefaultTextStyle();
            case 6:
                TextLayer.Companion companion5 = TextLayer.Companion;
                return new ArrayListSerializer(Mask$$serializer.f16239a);
            case 7:
                TextLayer.Companion companion6 = TextLayer.Companion;
                return new ArrayListSerializer(LayerEffect.INSTANCE.serializer());
            case 8:
                TextLayer.Companion companion7 = TextLayer.Companion;
                return new BooleanIntSerializer();
            case 9:
                TextLayer.Companion companion8 = TextLayer.Companion;
                return new BooleanIntSerializer();
            case 10:
                return TextLinkScope.textRange$lambda$0$0();
            case 11:
                return TextLinkScope.textRange$lambda$0$1();
            case 12:
                return TextSelectionColorsKt.DefaultTextSelectionColors;
            case 13:
                TextStyleAppModel.Companion companion9 = TextStyleAppModel.INSTANCE;
                return TextFormatAppModel.INSTANCE.serializer();
            case 14:
                TextStyleAppModel.Companion companion10 = TextStyleAppModel.INSTANCE;
                return new ArrayListSerializer(HtmlStyledData$$serializer.f10427a);
            case 15:
                ThresholdDetails.Companion companion11 = ThresholdDetails.INSTANCE;
                return new LinkedHashMapSerializer(StringSerializer.f18170a, LongSerializer.f18151a);
            case 16:
                TicketActivationsApiRequestModel.Companion companion12 = TicketActivationsApiRequestModel.INSTANCE;
                return new ArrayListSerializer(LongSerializer.f18151a);
            case 17:
                TicketBookingFareResponseApiModel.Companion companion13 = TicketBookingFareResponseApiModel.INSTANCE;
                return new ArrayListSerializer(PassengerDetailApiModel$$serializer.f3874a);
            case 18:
                TicketFinalFareRequestApiModel.Companion companion14 = TicketFinalFareRequestApiModel.INSTANCE;
                return new ArrayListSerializer(MetroFarePassengerDetailApiModel$$serializer.f5405a);
            case 19:
                TicketPurchaseArgs.Companion companion15 = TicketPurchaseArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.scenes.args.TicketPurchaseArgs", Reflection.a(TicketPurchaseArgs.class), new KClass[]{Reflection.a(TicketPurchaseArgs.MTicketTripInfoArgs.class), Reflection.a(TicketPurchaseArgs.PayForTicketArgs.class), Reflection.a(TicketPurchaseArgs.QuickPayArgs.class), Reflection.a(TicketPurchaseArgs.RouteSelectionArgs.InstantTicket.class), Reflection.a(TicketPurchaseArgs.StopSelectionArgs.InstantTicket.class), Reflection.a(TicketPurchaseArgs.StopSelectionArgs.ONDC.class), Reflection.a(TicketPurchaseArgs.StopSelectionArgs.PassPurchase.class)}, new KSerializer[]{TicketPurchaseArgs$MTicketTripInfoArgs$$serializer.f9323a, TicketPurchaseArgs$PayForTicketArgs$$serializer.f9324a, TicketPurchaseArgs$QuickPayArgs$$serializer.f9325a, new ObjectSerializer("app.chalo.scenes.args.TicketPurchaseArgs.RouteSelectionArgs.InstantTicket", TicketPurchaseArgs.RouteSelectionArgs.InstantTicket.INSTANCE, new Annotation[0]), TicketPurchaseArgs$StopSelectionArgs$InstantTicket$$serializer.f9326a, TicketPurchaseArgs$StopSelectionArgs$ONDC$$serializer.f9327a, TicketPurchaseArgs$StopSelectionArgs$PassPurchase$$serializer.f9328a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 20:
                TicketPurchaseArgs.MTicketTripInfoArgs.Companion companion16 = TicketPurchaseArgs.MTicketTripInfoArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 21:
                TicketPurchaseArgs.PayForTicketArgs.Companion companion17 = TicketPurchaseArgs.PayForTicketArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 22:
                TicketPurchaseArgs.QuickPayArgs.Companion companion18 = TicketPurchaseArgs.QuickPayArgs.INSTANCE;
                return Source.INSTANCE.serializer();
            case 23:
                TicketPurchaseArgs.RouteSelectionArgs.Companion companion19 = TicketPurchaseArgs.RouteSelectionArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.scenes.args.TicketPurchaseArgs.RouteSelectionArgs", Reflection.a(TicketPurchaseArgs.RouteSelectionArgs.class), new KClass[]{Reflection.a(TicketPurchaseArgs.RouteSelectionArgs.InstantTicket.class)}, new KSerializer[]{new ObjectSerializer("app.chalo.scenes.args.TicketPurchaseArgs.RouteSelectionArgs.InstantTicket", TicketPurchaseArgs.RouteSelectionArgs.InstantTicket.INSTANCE, new Annotation[0])});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 24:
                return new ObjectSerializer("app.chalo.scenes.args.TicketPurchaseArgs.RouteSelectionArgs.InstantTicket", TicketPurchaseArgs.RouteSelectionArgs.InstantTicket.INSTANCE, new Annotation[0]);
            case 25:
                TicketPurchaseArgs.StopSelectionArgs.Companion companion20 = TicketPurchaseArgs.StopSelectionArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer4 = new SealedClassSerializer("app.chalo.scenes.args.TicketPurchaseArgs.StopSelectionArgs", Reflection.a(TicketPurchaseArgs.StopSelectionArgs.class), new KClass[]{Reflection.a(TicketPurchaseArgs.StopSelectionArgs.InstantTicket.class), Reflection.a(TicketPurchaseArgs.StopSelectionArgs.ONDC.class), Reflection.a(TicketPurchaseArgs.StopSelectionArgs.PassPurchase.class)}, new KSerializer[]{TicketPurchaseArgs$StopSelectionArgs$InstantTicket$$serializer.f9326a, TicketPurchaseArgs$StopSelectionArgs$ONDC$$serializer.f9327a, TicketPurchaseArgs$StopSelectionArgs$PassPurchase$$serializer.f9328a});
                sealedClassSerializer4.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer4;
            case 26:
                return TicketQrSchemaType._init_$_anonymous_();
            case 27:
                return TicketReceiptFormatConfig._init_$_anonymous_();
            case 28:
                Lazy lazy = TicketTableAdapter.f2124a;
                return new TicketTableAdapter$routeStopsInfoAdapter$2$1();
            default:
                Lazy lazy2 = TicketTableAdapter.f2124a;
                return new TicketTableAdapter$passengerDetailsAdapter$2$1();
        }
    }
}
