package defpackage;

import androidx.compose.material3.BottomAppBarDefaults;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.saveable.Saver;
import app.chalo.appsupport.data.models.api.CancelBookingApiStatus;
import app.chalo.appsupport.data.models.api.CancelBookingResponseApiModel;
import app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData;
import app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$BookingFailed$$serializer;
import app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$BookingSuccess$$serializer;
import app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData$OverlappingBookingFailure$$serializer;
import app.chalo.bookingsuccessproducttype.BookingSuccessProductType;
import app.chalo.bookingsuccessproducttype.BookingSuccessProductType$GenderMismatchError$$serializer;
import app.chalo.bookingsuccessproducttype.BookingSuccessProductType$ONDCVehicleBasedTicket$$serializer;
import app.chalo.bookingsuccessproducttype.BookingSuccessProductType$PremiumBusReschedule$$serializer;
import app.chalo.bookingsuccessproducttype.BookingSuccessProductType$PremiumReserveTicket$$serializer;
import app.chalo.bookingsuccessproducttype.BookingSuccessProductType$QuickPay$$serializer;
import app.chalo.bookingsuccessproducttype.BookingSuccessProductType$SuperPassApplication$$serializer;
import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.data.BookingsRequestType$ApplicationPassType$$serializer;
import app.chalo.data.BookingsRequestType$CardRechargeType$$serializer;
import app.chalo.data.BookingsRequestType$CardTransactionReceiptType$$serializer;
import app.chalo.data.BookingsRequestType$InstantTicketType$$serializer;
import app.chalo.data.BookingsRequestType$MagicPassType$$serializer;
import app.chalo.data.BookingsRequestType$MetroTicketType$$serializer;
import app.chalo.data.BookingsRequestType$MobileTicketType$$serializer;
import app.chalo.data.BookingsRequestType$MultiModalGroupTicketType$$serializer;
import app.chalo.data.BookingsRequestType$OndcMetroTicketType$$serializer;
import app.chalo.data.BookingsRequestType$OndcTicketType$$serializer;
import app.chalo.data.BookingsRequestType$PendingSuperPassType$$serializer;
import app.chalo.data.BookingsRequestType$PremiumBusTicketType$$serializer;
import app.chalo.data.BookingsRequestType$QuickPayType$$serializer;
import app.chalo.data.BookingsRequestType$RideBasedPassType$$serializer;
import app.chalo.data.BookingsRequestType$SuperPassRideType$$serializer;
import app.chalo.home.data.model.api.BottomTabApiModel;
import app.chalo.home.data.model.api.SectionApiModel$$serializer;
import app.chalo.homescreen.data.model.app.BottomNavTabAppModel;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.models.productbooking.productcapability.CapabilitiesApiModel;
import app.chalo.models.productbooking.productcapability.ValidationSupportApiModel;
import app.chalo.premiumbus.data.models.api.response.SeatInfoApiModel$$serializer;
import app.chalo.premiumbus.data.models.app.BufferType;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel$$serializer;
import app.chalo.productbooking.common.data.models.api.request.BulkPreBookRequestApiModel;
import app.chalo.productbooking.common.data.models.app.response.BulkPreBookResponseAppModel;
import app.chalo.productbooking.common.data.models.app.response.BulkPreBookStatus;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.scenes.args.BookingSuccessArgs;
import app.chalo.scenes.args.BookingSuccessArgs$BulkBooking$$serializer;
import app.chalo.scenes.args.BookingSuccessArgs$ProductSuccessScreen$$serializer;
import app.chalo.scenes.args.BusesAroundYouArgs;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.CameraPositionStateKt;
import io.ktor.client.plugins.cache.storage.UnlimitedStorage;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19911a;

    public /* synthetic */ wb(int i) {
        this.f19911a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19911a) {
            case 0:
                BookingSuccessArgs.Companion companion = BookingSuccessArgs.INSTANCE;
                SealedClassSerializer sealedClassSerializer = new SealedClassSerializer("app.chalo.scenes.args.BookingSuccessArgs", Reflection.a(BookingSuccessArgs.class), new KClass[]{Reflection.a(BookingSuccessArgs.BulkBooking.class), Reflection.a(BookingSuccessArgs.ProductSuccessScreen.class)}, new KSerializer[]{BookingSuccessArgs$BulkBooking$$serializer.f9227a, BookingSuccessArgs$ProductSuccessScreen$$serializer.f9228a});
                sealedClassSerializer.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer;
            case 1:
                BookingSuccessArgs.BulkBooking.Companion companion2 = BookingSuccessArgs.BulkBooking.INSTANCE;
                return Source.INSTANCE.serializer();
            case 2:
                BookingSuccessArgs.BulkBooking.Companion companion3 = BookingSuccessArgs.BulkBooking.INSTANCE;
                return Source.INSTANCE.serializer();
            case 3:
                BookingSuccessArgs.ProductSuccessScreen.Companion companion4 = BookingSuccessArgs.ProductSuccessScreen.INSTANCE;
                return Source.INSTANCE.serializer();
            case 4:
                BookingSuccessArgs.ProductSuccessScreen.Companion companion5 = BookingSuccessArgs.ProductSuccessScreen.INSTANCE;
                return BookingSuccessProductType.INSTANCE.serializer();
            case 5:
                BookingSuccessArgs.ProductSuccessScreen.Companion companion6 = BookingSuccessArgs.ProductSuccessScreen.INSTANCE;
                return Source.INSTANCE.serializer();
            case 6:
                BookingSuccessProductType.Companion companion7 = BookingSuccessProductType.INSTANCE;
                SealedClassSerializer sealedClassSerializer2 = new SealedClassSerializer("app.chalo.bookingsuccessproducttype.BookingSuccessProductType", Reflection.a(BookingSuccessProductType.class), new KClass[]{Reflection.a(BookingSuccessProductType.GenderMismatchError.class), Reflection.a(BookingSuccessProductType.ONDCVehicleBasedTicket.class), Reflection.a(BookingSuccessProductType.PremiumBusReschedule.class), Reflection.a(BookingSuccessProductType.PremiumReserveTicket.class), Reflection.a(BookingSuccessProductType.QuickPay.class), Reflection.a(BookingSuccessProductType.SuperPassApplication.class)}, new KSerializer[]{BookingSuccessProductType$GenderMismatchError$$serializer.f1162a, BookingSuccessProductType$ONDCVehicleBasedTicket$$serializer.f1163a, BookingSuccessProductType$PremiumBusReschedule$$serializer.f1164a, BookingSuccessProductType$PremiumReserveTicket$$serializer.f1165a, BookingSuccessProductType$QuickPay$$serializer.f1166a, BookingSuccessProductType$SuperPassApplication$$serializer.f1167a});
                sealedClassSerializer2.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer2;
            case 7:
                BookingSuccessProductType.PremiumReserveTicket.Companion companion8 = BookingSuccessProductType.PremiumReserveTicket.INSTANCE;
                StringSerializer stringSerializer = StringSerializer.f18170a;
                return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
            case 8:
                return Unit.f17538a;
            case 9:
                BookingsRequestType.Companion companion9 = BookingsRequestType.INSTANCE;
                SealedClassSerializer sealedClassSerializer3 = new SealedClassSerializer("app.chalo.data.BookingsRequestType", Reflection.a(BookingsRequestType.class), new KClass[]{Reflection.a(BookingsRequestType.ApplicationPassType.class), Reflection.a(BookingsRequestType.CardRechargeType.class), Reflection.a(BookingsRequestType.CardTransactionReceiptType.class), Reflection.a(BookingsRequestType.InstantTicketType.class), Reflection.a(BookingsRequestType.MagicPassType.class), Reflection.a(BookingsRequestType.MetroTicketType.class), Reflection.a(BookingsRequestType.MobileTicketType.class), Reflection.a(BookingsRequestType.MultiModalGroupTicketType.class), Reflection.a(BookingsRequestType.OndcMetroTicketType.class), Reflection.a(BookingsRequestType.OndcTicketType.class), Reflection.a(BookingsRequestType.PendingSuperPassType.class), Reflection.a(BookingsRequestType.PremiumBusTicketType.class), Reflection.a(BookingsRequestType.QuickPayType.class), Reflection.a(BookingsRequestType.RideBasedPassType.class), Reflection.a(BookingsRequestType.SuperPassRideType.class)}, new KSerializer[]{BookingsRequestType$ApplicationPassType$$serializer.f2318a, BookingsRequestType$CardRechargeType$$serializer.f2319a, BookingsRequestType$CardTransactionReceiptType$$serializer.f2320a, BookingsRequestType$InstantTicketType$$serializer.f2321a, BookingsRequestType$MagicPassType$$serializer.f2322a, BookingsRequestType$MetroTicketType$$serializer.f2323a, BookingsRequestType$MobileTicketType$$serializer.f2324a, BookingsRequestType$MultiModalGroupTicketType$$serializer.f2325a, BookingsRequestType$OndcMetroTicketType$$serializer.f2326a, BookingsRequestType$OndcTicketType$$serializer.f2327a, BookingsRequestType$PendingSuperPassType$$serializer.f2328a, BookingsRequestType$PremiumBusTicketType$$serializer.f2329a, BookingsRequestType$QuickPayType$$serializer.f2330a, BookingsRequestType$RideBasedPassType$$serializer.f2331a, BookingsRequestType$SuperPassRideType$$serializer.f2332a});
                sealedClassSerializer3.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer3;
            case 10:
                return Boolean.valueOf(BottomAppBarDefaults.exitAlwaysScrollBehavior$lambda$1$lambda$0());
            case 11:
                BottomNavTabAppModel.Companion companion10 = BottomNavTabAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.homescreen.data.model.app.BottomNavTabType", BottomNavTabType.values());
            case 12:
                BottomNavTabAppModel.Companion companion11 = BottomNavTabAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 13:
                BottomNavTabAppModel.Companion companion12 = BottomNavTabAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.providers.iconassetprovider.IconType", IconType.values());
            case 14:
                BottomTabApiModel.Companion companion13 = BottomTabApiModel.Companion;
                return new ArrayListSerializer(SectionApiModel$$serializer.f2903a);
            case 15:
                return BufferType._init_$_anonymous_();
            case 16:
                BulkBookingAcknowledgementData.Companion companion14 = BulkBookingAcknowledgementData.Companion;
                SealedClassSerializer sealedClassSerializer4 = new SealedClassSerializer("app.chalo.bookingsuccess.data.BulkBookingAcknowledgementData", Reflection.a(BulkBookingAcknowledgementData.class), new KClass[]{Reflection.a(BulkBookingAcknowledgementData.BookingFailed.class), Reflection.a(BulkBookingAcknowledgementData.BookingSuccess.class), Reflection.a(BulkBookingAcknowledgementData.OverlappingBookingFailure.class)}, new KSerializer[]{BulkBookingAcknowledgementData$BookingFailed$$serializer.f1158a, BulkBookingAcknowledgementData$BookingSuccess$$serializer.f1159a, BulkBookingAcknowledgementData$OverlappingBookingFailure$$serializer.f1160a});
                sealedClassSerializer4.b = ArraysKt.e(new Annotation[0]);
                return sealedClassSerializer4;
            case 17:
                BulkBookingAcknowledgementData.BookingFailed.Companion companion15 = BulkBookingAcknowledgementData.BookingFailed.Companion;
                return SuperPassSubTypes.INSTANCE.serializer();
            case 18:
                BulkBookingAcknowledgementData.BookingFailed.Companion companion16 = BulkBookingAcknowledgementData.BookingFailed.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 19:
                BulkBookingAcknowledgementData.BookingFailed.Companion companion17 = BulkBookingAcknowledgementData.BookingFailed.Companion;
                return new ArrayListSerializer(SeatInfoAppModel$$serializer.f7123a);
            case 20:
                BulkBookingAcknowledgementData.BookingSuccess.Companion companion18 = BulkBookingAcknowledgementData.BookingSuccess.Companion;
                return SuperPassSubTypes.INSTANCE.serializer();
            case 21:
                BulkBookingAcknowledgementData.OverlappingBookingFailure.Companion companion19 = BulkBookingAcknowledgementData.OverlappingBookingFailure.Companion;
                return SuperPassSubTypes.INSTANCE.serializer();
            case 22:
                BulkPreBookRequestApiModel.Companion companion20 = BulkPreBookRequestApiModel.Companion;
                return new ArrayListSerializer(StringSerializer.f18170a);
            case 23:
                BulkPreBookRequestApiModel.Companion companion21 = BulkPreBookRequestApiModel.Companion;
                return new ArrayListSerializer(SeatInfoApiModel$$serializer.f7063a);
            case 24:
                BulkPreBookResponseAppModel.Companion companion22 = BulkPreBookResponseAppModel.INSTANCE;
                return EnumsKt.b("app.chalo.productbooking.common.data.models.app.response.BulkPreBookStatus", BulkPreBookStatus.values());
            case 25:
                return new ObjectSerializer("app.chalo.scenes.args.BusesAroundYouArgs", BusesAroundYouArgs.INSTANCE, new Annotation[0]);
            case 26:
                return new UnlimitedStorage();
            case 27:
                ProvidableCompositionLocal providableCompositionLocal = CameraPositionStateKt.f14593a;
                Saver saver = CameraPositionState.h;
                return CameraPositionState.Companion.a();
            case 28:
                CancelBookingResponseApiModel.Companion companion23 = CancelBookingResponseApiModel.INSTANCE;
                return EnumsKt.b("app.chalo.appsupport.data.models.api.CancelBookingApiStatus", CancelBookingApiStatus.values());
            default:
                CapabilitiesApiModel.Companion companion24 = CapabilitiesApiModel.INSTANCE;
                return new ArrayListSerializer(ValidationSupportApiModel.INSTANCE.serializer());
        }
    }
}
