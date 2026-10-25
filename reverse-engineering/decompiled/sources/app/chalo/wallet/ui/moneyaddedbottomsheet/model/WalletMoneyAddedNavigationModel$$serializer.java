package app.chalo.wallet.ui.moneyaddedbottomsheet.model;

import app.chalo.walletframework.wallet.data.model.LoadMoneyOrderStatus;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/wallet/ui/moneyaddedbottomsheet/model/WalletMoneyAddedNavigationModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/wallet/ui/moneyaddedbottomsheet/model/WalletMoneyAddedNavigationModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class WalletMoneyAddedNavigationModel$$serializer implements GeneratedSerializer<WalletMoneyAddedNavigationModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WalletMoneyAddedNavigationModel$$serializer f10889a;
    private static final SerialDescriptor descriptor;

    static {
        WalletMoneyAddedNavigationModel$$serializer walletMoneyAddedNavigationModel$$serializer = new WalletMoneyAddedNavigationModel$$serializer();
        f10889a = walletMoneyAddedNavigationModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.wallet.ui.moneyaddedbottomsheet.model.WalletMoneyAddedNavigationModel", walletMoneyAddedNavigationModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("amountAdded", false);
        pluginGeneratedSerialDescriptor.j("walletBalance", false);
        pluginGeneratedSerialDescriptor.j("loadMoneyOrderStatus", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = WalletMoneyAddedNavigationModel.d;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{intSerializer, intSerializer, lazyArr[2].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        int i;
        int iDecodeIntElement2;
        LoadMoneyOrderStatus loadMoneyOrderStatus;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = WalletMoneyAddedNavigationModel.d;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            loadMoneyOrderStatus = (LoadMoneyOrderStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            i = 7;
        } else {
            boolean z = true;
            iDecodeIntElement = 0;
            int iDecodeIntElement3 = 0;
            LoadMoneyOrderStatus loadMoneyOrderStatus2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    loadMoneyOrderStatus2 = (LoadMoneyOrderStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), loadMoneyOrderStatus2);
                    i2 |= 4;
                }
            }
            i = i2;
            iDecodeIntElement2 = iDecodeIntElement3;
            loadMoneyOrderStatus = loadMoneyOrderStatus2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletMoneyAddedNavigationModel(i, iDecodeIntElement, iDecodeIntElement2, loadMoneyOrderStatus);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        WalletMoneyAddedNavigationModel value = (WalletMoneyAddedNavigationModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = WalletMoneyAddedNavigationModel.d;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f10888a);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
