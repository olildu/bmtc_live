package app.chalo.models.mticketing;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.citydata.data.model.app.RouteStopsInfo$$serializer;
import app.chalo.models.userprofile.UserProfile;
import app.chalo.models.userprofile.UserProfile$$serializer;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/mticketing/MTicket.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/mticketing/MTicket;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MTicket$$serializer implements GeneratedSerializer<MTicket> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MTicket$$serializer f5616a;
    private static final SerialDescriptor descriptor;

    static {
        MTicket$$serializer mTicket$$serializer = new MTicket$$serializer();
        f5616a = mTicket$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.mticketing.MTicket", mTicket$$serializer, 30);
        pluginGeneratedSerialDescriptor.j("mTicketId", true);
        pluginGeneratedSerialDescriptor.j("userId", true);
        pluginGeneratedSerialDescriptor.j(CLConstants.SALT_FIELD_DEVICE_ID, true);
        pluginGeneratedSerialDescriptor.j("cityName", false);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("upTripRouteStopsInfo", false);
        pluginGeneratedSerialDescriptor.j("upTripRouteStopsStageInfo", true);
        pluginGeneratedSerialDescriptor.j("passengerDetails", true);
        pluginGeneratedSerialDescriptor.j("bookingTime", true);
        pluginGeneratedSerialDescriptor.j("expirationTime", true);
        pluginGeneratedSerialDescriptor.j("isExpired", true);
        pluginGeneratedSerialDescriptor.j("upTripActivationTime", true);
        pluginGeneratedSerialDescriptor.j("isUpTripActivated", true);
        pluginGeneratedSerialDescriptor.j("upTripPunchingTime", true);
        pluginGeneratedSerialDescriptor.j("userProfile", true);
        pluginGeneratedSerialDescriptor.j("qrCode", true);
        pluginGeneratedSerialDescriptor.j("tone", true);
        pluginGeneratedSerialDescriptor.j("mTicketConfiguration", false);
        pluginGeneratedSerialDescriptor.j("isFreeRide", true);
        pluginGeneratedSerialDescriptor.j("isPaymentRequired", true);
        pluginGeneratedSerialDescriptor.j("recentPaymentMethod", true);
        pluginGeneratedSerialDescriptor.j("cardDetails", true);
        pluginGeneratedSerialDescriptor.j("customerId", true);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.ORDER_ID_CAMEL, true);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("paymentMode", true);
        pluginGeneratedSerialDescriptor.j("mticketTripReceipt", true);
        pluginGeneratedSerialDescriptor.j("productName", true);
        pluginGeneratedSerialDescriptor.j("productType", true);
        pluginGeneratedSerialDescriptor.j("productSubType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = MTicket.E;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        RouteStopsInfo$$serializer routeStopsInfo$$serializer = RouteStopsInfo$$serializer.f1718a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), stringSerializer, stringSerializer, routeStopsInfo$$serializer, BuiltinSerializersKt.c(routeStopsInfo$$serializer), lazyArr[7].getValue(), longSerializer, longSerializer, booleanSerializer, longSerializer, booleanSerializer, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(UserProfile$$serializer.f5691a), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), MTicketConfiguration$$serializer.f5620a, BuiltinSerializersKt.c(booleanSerializer), booleanSerializer, BuiltinSerializersKt.c((KSerializer) lazyArr[20].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[21].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(MTicketTripReceipt$$serializer.f5624a), stringSerializer, stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        int i;
        List list;
        String str3;
        Boolean bool;
        String str4;
        UserProfile userProfile;
        Map map;
        Long l;
        MTicketConfiguration mTicketConfiguration;
        RouteStopsInfo routeStopsInfo;
        String str5;
        RouteStopsInfo routeStopsInfo2;
        MTicketTripReceipt mTicketTripReceipt;
        String str6;
        String str7;
        String str8;
        String str9;
        List list2;
        String str10;
        String str11;
        boolean z;
        String str12;
        String str13;
        String strDecodeStringElement;
        long j;
        boolean z2;
        long j2;
        long j3;
        boolean z3;
        String strDecodeStringElement2;
        List list3;
        int i2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MTicket.E;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            RouteStopsInfo$$serializer routeStopsInfo$$serializer = RouteStopsInfo$$serializer.f1718a;
            RouteStopsInfo routeStopsInfo3 = (RouteStopsInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, routeStopsInfo$$serializer, null);
            RouteStopsInfo routeStopsInfo4 = (RouteStopsInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, routeStopsInfo$$serializer, null);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.f18151a, null);
            UserProfile userProfile2 = (UserProfile) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, UserProfile$$serializer.f5691a, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            MTicketConfiguration mTicketConfiguration2 = (MTicketConfiguration) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, MTicketConfiguration$$serializer.f5620a, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.f18123a, null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, (DeserializationStrategy) lazyArr[21].getValue(), null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, stringSerializer, null);
            MTicketTripReceipt mTicketTripReceipt2 = (MTicketTripReceipt) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, MTicketTripReceipt$$serializer.f5624a, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            mTicketTripReceipt = mTicketTripReceipt2;
            str9 = str18;
            map = map2;
            str12 = strDecodeStringElement6;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
            z = zDecodeBooleanElement2;
            routeStopsInfo = routeStopsInfo4;
            j = jDecodeLongElement2;
            routeStopsInfo2 = routeStopsInfo3;
            str10 = strDecodeStringElement4;
            str11 = strDecodeStringElement5;
            z2 = zDecodeBooleanElement;
            str = str15;
            str13 = strDecodeStringElement7;
            i = 1073741823;
            str6 = str21;
            str7 = str20;
            str8 = str19;
            list2 = list5;
            z3 = zDecodeBooleanElement3;
            bool = bool2;
            mTicketConfiguration = mTicketConfiguration2;
            str2 = str17;
            userProfile = userProfile2;
            str4 = str16;
            list = list4;
            str3 = str14;
            str5 = strDecodeStringElement3;
            j2 = jDecodeLongElement3;
            j3 = jDecodeLongElement;
            l = l2;
        } else {
            boolean z4 = true;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            int i3 = 0;
            int i4 = 7;
            RouteStopsInfo routeStopsInfo5 = null;
            String str22 = null;
            Boolean bool3 = null;
            String str23 = null;
            UserProfile userProfile3 = null;
            Map map3 = null;
            Long l3 = null;
            MTicketConfiguration mTicketConfiguration3 = null;
            RouteStopsInfo routeStopsInfo6 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            List list6 = null;
            List list7 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            MTicketTripReceipt mTicketTripReceipt3 = null;
            String str28 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            long jDecodeLongElement4 = 0;
            long jDecodeLongElement5 = 0;
            long jDecodeLongElement6 = 0;
            boolean zDecodeBooleanElement6 = false;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        strDecodeStringElement2 = str30;
                        z4 = false;
                        list3 = list6;
                        str30 = strDecodeStringElement2;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        list3 = list6;
                        str30 = strDecodeStringElement2;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 1:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        routeStopsInfo5 = routeStopsInfo5;
                        i3 |= 2;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str31);
                        list3 = list6;
                        str30 = str30;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 2:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str30 = str30;
                        str31 = str31;
                        list6 = list6;
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str29);
                        i3 |= 4;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 3:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str30 = str30;
                        str31 = str31;
                        list6 = list6;
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 4:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str30 = str30;
                        str31 = str31;
                        list6 = list6;
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 5:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str30 = str30;
                        str31 = str31;
                        list6 = list6;
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        routeStopsInfo5 = (RouteStopsInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, RouteStopsInfo$$serializer.f1718a, routeStopsInfo5);
                        i3 |= 32;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 6:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str30 = str30;
                        str31 = str31;
                        list6 = list6;
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        i3 |= 64;
                        routeStopsInfo6 = (RouteStopsInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, RouteStopsInfo$$serializer.f1718a, routeStopsInfo6);
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 7:
                        i2 = i3 | 128;
                        map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), map3);
                        i3 = i2;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 8:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 8);
                        i2 = i3 | 256;
                        i3 = i2;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 9:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
                        i2 = i3 | 512;
                        i3 = i2;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 10:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i2 = i3 | 1024;
                        i3 = i2;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 11:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 11);
                        i2 = i3 | 2048;
                        i3 = i2;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 12:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i2 = i3 | 4096;
                        i3 = i2;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 13:
                        i2 = i3 | 8192;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.f18151a, l3);
                        i3 = i2;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 14:
                        i2 = i3 | 16384;
                        userProfile3 = (UserProfile) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, UserProfile$$serializer.f5691a, userProfile3);
                        i3 = i2;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 15:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str30 = str30;
                        str31 = str31;
                        list6 = list6;
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        i3 |= 32768;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str23);
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 16:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str30 = str30;
                        str31 = str31;
                        list6 = list6;
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str22);
                        i3 |= 65536;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 17:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str30 = str30;
                        str31 = str31;
                        list6 = list6;
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        i3 |= 131072;
                        mTicketConfiguration3 = (MTicketConfiguration) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, MTicketConfiguration$$serializer.f5620a, mTicketConfiguration3);
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 18:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str30 = str30;
                        str31 = str31;
                        list6 = list6;
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        i3 |= 262144;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.f18123a, bool3);
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 19:
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        i3 |= 524288;
                        list3 = list6;
                        str30 = str30;
                        str31 = str31;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 20:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str30 = str30;
                        str31 = str31;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        list7 = list7;
                        i3 |= 1048576;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), list6);
                        str30 = str30;
                        str31 = str31;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 21:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str24 = str24;
                        i3 |= 2097152;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, (DeserializationStrategy) lazyArr[21].getValue(), list7);
                        str30 = str30;
                        str31 = str31;
                        list3 = list6;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 22:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str26 = str26;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str25 = str25;
                        i3 |= 4194304;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str24);
                        str30 = str30;
                        str31 = str31;
                        list3 = list6;
                        list7 = list7;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 23:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        str27 = str27;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str26 = str26;
                        i3 |= 8388608;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.f18170a, str25);
                        str30 = str30;
                        str31 = str31;
                        list3 = list6;
                        list7 = list7;
                        str24 = str24;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 24:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        i3 |= 16777216;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.f18170a, str26);
                        str30 = str30;
                        str31 = str31;
                        list3 = list6;
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 25:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        i3 |= 33554432;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.f18170a, str27);
                        str30 = str30;
                        str31 = str31;
                        list3 = list6;
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 26:
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        MTicketTripReceipt mTicketTripReceipt4 = (MTicketTripReceipt) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, MTicketTripReceipt$$serializer.f5624a, mTicketTripReceipt3);
                        i3 |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        mTicketTripReceipt3 = mTicketTripReceipt4;
                        str30 = str30;
                        str31 = str31;
                        list3 = list6;
                        list7 = list7;
                        str24 = str24;
                        str25 = str25;
                        str26 = str26;
                        str27 = str27;
                        routeStopsInfo5 = routeStopsInfo5;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 27:
                        String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i3 |= C.BUFFER_FLAG_FIRST_SAMPLE;
                        str28 = strDecodeStringElement12;
                        list3 = list6;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 28:
                        i3 |= 268435456;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        list3 = list6;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    case 29:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 29);
                        i3 |= 536870912;
                        list3 = list6;
                        list6 = list3;
                        routeStopsInfo5 = routeStopsInfo5;
                        mTicketTripReceipt3 = mTicketTripReceipt3;
                        str27 = str27;
                        str26 = str26;
                        str25 = str25;
                        str24 = str24;
                        list7 = list7;
                        zDecodeBooleanElement6 = zDecodeBooleanElement6;
                        i4 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str29;
            str2 = str22;
            i = i3;
            list = list6;
            str3 = str31;
            bool = bool3;
            str4 = str23;
            userProfile = userProfile3;
            map = map3;
            l = l3;
            mTicketConfiguration = mTicketConfiguration3;
            routeStopsInfo = routeStopsInfo6;
            str5 = str30;
            routeStopsInfo2 = routeStopsInfo5;
            mTicketTripReceipt = mTicketTripReceipt3;
            str6 = str27;
            str7 = str26;
            str8 = str25;
            str9 = str24;
            list2 = list7;
            str10 = strDecodeStringElement8;
            str11 = strDecodeStringElement9;
            z = zDecodeBooleanElement4;
            str12 = str28;
            str13 = strDecodeStringElement10;
            strDecodeStringElement = strDecodeStringElement11;
            j = jDecodeLongElement4;
            z2 = zDecodeBooleanElement5;
            j2 = jDecodeLongElement5;
            j3 = jDecodeLongElement6;
            z3 = zDecodeBooleanElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MTicket(i, str5, str3, str, str10, str11, routeStopsInfo2, routeStopsInfo, map, j3, j, z2, j2, z, l, userProfile, str4, str2, mTicketConfiguration, bool, z3, list, list2, str9, str8, str7, str6, mTicketTripReceipt, str12, str13, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:116:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0210  */
    /* JADX WARN: Code duplicated, block: B:121:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0222  */
    /* JADX WARN: Code duplicated, block: B:126:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0234  */
    /* JADX WARN: Code duplicated, block: B:130:0x0243  */
    /* JADX WARN: Code duplicated, block: B:131:0x0246  */
    /* JADX WARN: Code duplicated, block: B:136:0x025e  */
    /* JADX WARN: Code duplicated, block: B:137:0x0261  */
    /* JADX WARN: Code duplicated, block: B:142:0x0274  */
    /* JADX WARN: Code duplicated, block: B:143:0x0277  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x01bc  */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Boolean bool;
        boolean z;
        String str;
        String str2;
        String str3;
        MTicket value = (MTicket) obj;
        Intrinsics.i(value, "value");
        String str4 = value.D;
        String str5 = value.C;
        String str6 = value.B;
        MTicketTripReceipt mTicketTripReceipt = value.A;
        String str7 = value.z;
        String str8 = value.y;
        String str9 = value.x;
        String str10 = value.w;
        List list = value.v;
        List list2 = value.u;
        boolean z2 = value.t;
        Boolean bool2 = value.s;
        String str11 = value.q;
        String str12 = value.p;
        UserProfile userProfile = value.o;
        String str13 = value.c;
        String str14 = value.b;
        String str15 = value.f5615a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MTicket.E;
        int i = 0;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0)) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, i, str15);
        } else if (!Intrinsics.d(str15, "")) {
            i = 0;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, i, str15);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str14 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str14);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || str13 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str13);
        }
        String str16 = value.d;
        Long l = value.n;
        boolean z3 = value.m;
        long j = value.l;
        boolean z4 = value.k;
        long j2 = value.j;
        long j3 = value.i;
        Map map = value.h;
        RouteStopsInfo routeStopsInfo = value.g;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, str16);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        RouteStopsInfo$$serializer routeStopsInfo$$serializer = RouteStopsInfo$$serializer.f1718a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, routeStopsInfo$$serializer, value.f);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || routeStopsInfo != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, routeStopsInfo$$serializer, routeStopsInfo);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.d(map, MapsKt.d())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), map);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || j3 != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 8, j3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || j2 != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 9, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || z4) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 10, z4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || j != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 11, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 12, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || l == null || l.longValue() != 0) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || userProfile != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, UserProfile$$serializer.f5691a, userProfile);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || str12 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str12);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16) || str11 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str11);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 17, MTicketConfiguration$$serializer.f5620a, value.r);
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
            bool = bool2;
            if (!Intrinsics.d(bool, Boolean.FALSE)) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
                z = z2;
                if (!z) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20) || list2 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21) || list != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22) || str10 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str10);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 23) || str9 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.f18170a, str9);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 24) || str8 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.f18170a, str8);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 25) || str7 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.f18170a, str7);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 26) || mTicketTripReceipt != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 26, MTicketTripReceipt$$serializer.f5624a, mTicketTripReceipt);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 27)) {
                    str = str6;
                    if (!Intrinsics.d(str, "Single Journey Ticket")) {
                    }
                    if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 28)) {
                        str2 = str5;
                        if (!Intrinsics.d(str2, "singleJourneyTicket")) {
                        }
                        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                            if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                            }
                            str3 = str4;
                            compositeEncoderBeginStructure.endStructure(serialDescriptor);
                        }
                        str3 = str4;
                        str3 = str4;
                        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
                        str3 = str4;
                        compositeEncoderBeginStructure.endStructure(serialDescriptor);
                    }
                    str2 = str5;
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 28, str2);
                    if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                        if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                        }
                        str3 = str4;
                        compositeEncoderBeginStructure.endStructure(serialDescriptor);
                    }
                    str3 = str4;
                    str3 = str4;
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
                    str3 = str4;
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                str = str6;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 27, str);
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 28)) {
                    str2 = str5;
                    if (!Intrinsics.d(str2, "singleJourneyTicket")) {
                    }
                    if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                        if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                        }
                        str3 = str4;
                        compositeEncoderBeginStructure.endStructure(serialDescriptor);
                    }
                    str3 = str4;
                    str3 = str4;
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
                    str3 = str4;
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                str2 = str5;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 28, str2);
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                    if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                    }
                    str3 = str4;
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                str3 = str4;
                str3 = str4;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
                str3 = str4;
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            z = z2;
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str10);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str10);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 23)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.f18170a, str9);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.f18170a, str9);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 24)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.f18170a, str8);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.f18170a, str8);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 25)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.f18170a, str7);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.f18170a, str7);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 26)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 26, MTicketTripReceipt$$serializer.f5624a, mTicketTripReceipt);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 26, MTicketTripReceipt$$serializer.f5624a, mTicketTripReceipt);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 27)) {
                str = str6;
                if (!Intrinsics.d(str, "Single Journey Ticket")) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 28)) {
                    str2 = str5;
                    if (!Intrinsics.d(str2, "singleJourneyTicket")) {
                    }
                    if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                        if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                        }
                        str3 = str4;
                        compositeEncoderBeginStructure.endStructure(serialDescriptor);
                    }
                    str3 = str4;
                    str3 = str4;
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
                    str3 = str4;
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                str2 = str5;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 28, str2);
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                    if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                    }
                    str3 = str4;
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                str3 = str4;
                str3 = str4;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
                str3 = str4;
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str = str6;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 27, str);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 28)) {
                str2 = str5;
                if (!Intrinsics.d(str2, "singleJourneyTicket")) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                    if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                    }
                    str3 = str4;
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                str3 = str4;
                str3 = str4;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
                str3 = str4;
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str2 = str5;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 28, str2);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                }
                str3 = str4;
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str3 = str4;
            str3 = str4;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
            str3 = str4;
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        bool = bool2;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.f18123a, bool);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
            z = z2;
            if (!z) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str10);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str10);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 23)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.f18170a, str9);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.f18170a, str9);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 24)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.f18170a, str8);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.f18170a, str8);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 25)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.f18170a, str7);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.f18170a, str7);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 26)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 26, MTicketTripReceipt$$serializer.f5624a, mTicketTripReceipt);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 26, MTicketTripReceipt$$serializer.f5624a, mTicketTripReceipt);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 27)) {
                str = str6;
                if (!Intrinsics.d(str, "Single Journey Ticket")) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 28)) {
                    str2 = str5;
                    if (!Intrinsics.d(str2, "singleJourneyTicket")) {
                    }
                    if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                        if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                        }
                        str3 = str4;
                        compositeEncoderBeginStructure.endStructure(serialDescriptor);
                    }
                    str3 = str4;
                    str3 = str4;
                    compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
                    str3 = str4;
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                str2 = str5;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 28, str2);
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                    if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                    }
                    str3 = str4;
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                str3 = str4;
                str3 = str4;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
                str3 = str4;
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str = str6;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 27, str);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 28)) {
                str2 = str5;
                if (!Intrinsics.d(str2, "singleJourneyTicket")) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                    if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                    }
                    str3 = str4;
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                str3 = str4;
                str3 = str4;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
                str3 = str4;
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str2 = str5;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 28, str2);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                }
                str3 = str4;
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str3 = str4;
            str3 = str4;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
            str3 = str4;
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        z = z2;
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (SerializationStrategy) lazyArr[21].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str10);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 23)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.f18170a, str9);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.f18170a, str9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 24)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.f18170a, str8);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.f18170a, str8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 25)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.f18170a, str7);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.f18170a, str7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 26)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 26, MTicketTripReceipt$$serializer.f5624a, mTicketTripReceipt);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 26, MTicketTripReceipt$$serializer.f5624a, mTicketTripReceipt);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 27)) {
            str = str6;
            if (!Intrinsics.d(str, "Single Journey Ticket")) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 28)) {
                str2 = str5;
                if (!Intrinsics.d(str2, "singleJourneyTicket")) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                    if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                    }
                    str3 = str4;
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
                str3 = str4;
                str3 = str4;
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
                str3 = str4;
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str2 = str5;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 28, str2);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                }
                str3 = str4;
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str3 = str4;
            str3 = str4;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
            str3 = str4;
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        str = str6;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 27, str);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 28)) {
            str2 = str5;
            if (!Intrinsics.d(str2, "singleJourneyTicket")) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
                if (!Intrinsics.d(str3, "singleJourneyTicket")) {
                }
                str3 = str4;
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str3 = str4;
            str3 = str4;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
            str3 = str4;
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        str2 = str5;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 28, str2);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
            if (!Intrinsics.d(str3, "singleJourneyTicket")) {
            }
            str3 = str4;
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        str3 = str4;
        str3 = str4;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 29, str3);
        str3 = str4;
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
